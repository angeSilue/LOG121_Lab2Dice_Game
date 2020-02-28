package framework;

public class De implements Comparable<De> {
    private int nbFaces;
    private int idDes;
    private int faceActu;

    public De(){
        this(0);
    }

    public De(int nbFaces) {
        this(0, 0);
    }

    public De(int nbFaces, int id){
        this.nbFaces = nbFaces;
        this.idDes = id;
    }

    @Override
    public int compareTo(De de) {
        if(faceActu == de.faceActu)
            return 0;
        else if(faceActu >  de.faceActu)
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

    public int getIdDes() {
        return idDes;
    }

    public void setIdDes(int idDes) {
        this.idDes = idDes;
    }

    public int getFaceActu() {
        return faceActu;
    }

    public void setFaceActu(int faceActu) {
        this.faceActu = faceActu;
    }
}