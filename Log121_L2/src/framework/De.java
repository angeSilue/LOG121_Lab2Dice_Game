package framework;

import java.util.Random;

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

    public int genererFace(int nbFaces) throws IllegalArgumentException {
        try{
            int nb = new Random().nextInt(nbFaces) + 1;
            return nb;
        }
        catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
           return 0;
        }

    }

    @Override
    public int compareTo(De de) {
        if(de == null) {
            throw new IllegalArgumentException();
        }
        else if(faceObtenue == de.faceObtenue)
            return 0;
        else if(faceObtenue >  de.faceObtenue)
            return 1;
        else
            return -1;
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

    public void setFaceObtenue(int faceObtenue) throws IllegalArgumentException {
        try{
            if(faceObtenue >= 0 && faceObtenue <= nbFaces){
                this.faceObtenue = faceObtenue;
            }
            else{
                this.faceObtenue = 0; // valeur de faceObtenue mis a zero car argument non valide
                System.out.println("valeur de faceObtenue mis a zero car argument non valide");
            }
        }
        catch (IllegalArgumentException ex){
            System.err.println(ex.toString()+ " la valeur de la face doit etre superieur a 0 et inferieur au nombre de face");
        }
    }
}