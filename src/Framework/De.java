package Framework;

public class De implements Comparable<De> {
    int nbFaces;
    int idDes;
    int faceActu;

    De (int nbFaces, int id){
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
}
