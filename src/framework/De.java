package framework;

import java.util.*;

public class De implements Comparable<De> {
    private int nbFaces;
    private int idDe;
    private int faceObtenue;

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
        faceObtenue = genererFace(nbFaces);
    }

    public int genererFace(int nbFaces){
        int nb = new Random().nextInt(nbFaces) + 1;
        return nb;
    }

    @Override
    public int compareTo(De de) {
        if(faceObtenue == de.faceObtenue) {
            return 0;
        }
        else if(faceObtenue <  de.faceObtenue) {
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

    public int getFaceObtenue() {
        return faceObtenue;
    }

    public void setFaceObtenue(int faceObtenue) {
        this.faceObtenue = faceObtenue;
    }
}