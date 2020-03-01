package framework;

import java.util.*;

public class De implements Comparable<De> {
    private int nbFaces;
    private int idDe;
    private int faceActuelle;

    public De(){
        this(0);
    }

    public De(int nbFaces) {
        this(nbFaces, 0);
    }

    public De(int nbFaces, int id){
        this.nbFaces = nbFaces;
        this.idDe = id;
    }

    public void brasserDe() {
        faceActuelle = genererFace(nbFaces);
    }

    public int genererFace(int nbFaces){
        int nb = new Random().nextInt(nbFaces) + 1;
        return nb;
    }

    @Override
    public int compareTo(De de) {
        if(faceActuelle == de.faceActuelle) {
            return 0;
        }
        else if(faceActuelle >  de.faceActuelle) {
            return 1;
        }
        else {
            return -1;
        }
    }


    public int getNbFaces() {
        return nbFaces;
    }

    public void setNbFaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public int getIdDe() {
        return idDe;
    }

    public void setIdDe(int idDe) {
        this.idDe = idDe;
    }

    public int getFaceActuelle() {
        return faceActuelle;
    }

    public void setFaceActuelle(int faceActuelle) {
        this.faceActuelle = faceActuelle;
    }
}