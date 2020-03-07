package testjunit;

import static org.junit.Assert.*;

import framework.De;
import framework.Joueur;
import org.junit.Before;
import org.junit.Test;




public class JoueurTest {

    private Joueur joueur1;
    private Joueur joueur2;


    @Before
    public void faireAvant() {
        joueur1 = new Joueur("joueur1");
        joueur2 = new Joueur("joueur2");
    }

    @Test
    public void joueurScoreSuperieurTest() {
        joueur1.setScoreAccumule(10);
        joueur2.setScoreAccumule(15);
        assertTrue(joueur1.compareTo(joueur2) == 1);
    }


    @Test
    public void joueurScoreInferieurTest() {
        joueur1.setScoreAccumule(10);
        joueur2.setScoreAccumule(15);
        assertTrue(joueur2.compareTo(joueur1) == -1);
    }

    @Test
    public void joueurScoreMemeTest() {
        joueur1.setScoreAccumule(10);
        joueur2.setScoreAccumule(10);
        assertTrue(joueur1.compareTo(joueur2) == 0);
    }


    @Test(expected=IllegalArgumentException.class)
    public void deNullTest(){
        joueur1.setScoreAccumule(4);
        joueur1.compareTo(null);
    }





}
