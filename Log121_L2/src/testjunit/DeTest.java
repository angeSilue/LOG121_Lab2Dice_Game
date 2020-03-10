package testjunit;

import framework.De;
import org.junit.jupiter.api.Assertions.*;
public class DeTest {

    private final int NB_FACES = 5;
    private De deTest = new De(NB_FACES,0);
    private De deTest2 = new De(NB_FACES,0);
    //private int idDe = deTest.getIdDe();
    private final int randNb = deTest.genererFace(NB_FACES);

    @org.junit.jupiter.api.Test
    void brasserDe() {
        deTest.brasserDe();
        assert(deTest.getFaceObtenue() <= NB_FACES && deTest.getFaceObtenue()>0) ;
    }

    @org.junit.jupiter.api.Test
    void genererFace() {
        assert( randNb <= NB_FACES);
    }

    @org.junit.jupiter.api.Test
    void compareTo() {
        deTest.setFaceObtenue(2);
        deTest2.setFaceObtenue(4);
        assert(deTest.compareTo(deTest2) == -1);//face deTest inferieur face deTest2
        deTest.setFaceObtenue(4);
        deTest2.setFaceObtenue(4);
        assert(deTest.compareTo(deTest2) == 0);//face deTest egale face deTest2
        deTest.setFaceObtenue(4);
        deTest2.setFaceObtenue(2);
        assert(deTest.compareTo(deTest2) == 1);//face deTest superieur face deTest2

    }

    @org.junit.jupiter.api.Test
    void getNbFaces() {
        assert(deTest.getNbFaces() == NB_FACES);
    }

    @org.junit.jupiter.api.Test
    void setNbFaces() {
        deTest.setNbFaces(8);
        assert(deTest.getNbFaces() == 8);
    }

    @org.junit.jupiter.api.Test
    void getIdDe() {
        assert(deTest.getIdDe() == 0 );
    }

    @org.junit.jupiter.api.Test
    void setIdDe() {
        deTest.setIdDe(3);
        assert(deTest.getIdDe() == 3);
    }

    @org.junit.jupiter.api.Test
    void getFaceObtenue() {
        deTest.setFaceObtenue(3);
        assert(deTest.getFaceObtenue() == 3);
    }

    @org.junit.jupiter.api.Test
    void setFaceObtenue() {
        deTest.setFaceObtenue(5);
        assert(deTest.getFaceObtenue() == 5);
    }
}
