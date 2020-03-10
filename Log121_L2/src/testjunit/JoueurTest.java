package testjunit;

import framework.Joueur;
import org.junit.jupiter.api.Test;

public class JoueurTest {

    private Joueur joueur1 = new Joueur("jeff",32);
    private Joueur joueur2 = new Joueur("dave",24);

    @Test
    void compareTo() {
        joueur1.setScoreAccumule(23);
        joueur2.setScoreAccumule(44);
        assert(joueur1.compareTo(joueur2) == -1);//score joueur1 inferieur score joueur2
        joueur1.setScoreAccumule(23);
        joueur2.setScoreAccumule(23);
        assert(joueur1.compareTo(joueur2) == 0);//score joueur1 egale score joueur2
        joueur1.setScoreAccumule(44);
        joueur2.setScoreAccumule(23);
        assert(joueur1.compareTo(joueur2) == 1);//score joueur1 superieur score joueur2
    }

    @Test
    void getNom() {
       assert(joueur1.getNom() == "jeff");
    }

    @Test
    void setNom() {
        joueur1.setNom("chris");
        assert(joueur1.getNom()== "chris");
    }

    @Test
    void getScoreAccumule() {
        assert(joueur2.getScoreAccumule() == 24);
    }

    @Test
    void setScoreAccumule() {
        joueur2.setScoreAccumule(12);
        assert(joueur2.getScoreAccumule() == 12);
    }

    @Test
    void isVainqueur() {
        joueur1.setVainqueur(true);
        assert(joueur1.isVainqueur() == true);
    }

    @Test
    void setVainqueur() {
        joueur2.setVainqueur(false);
        assert(joueur2.isVainqueur() == false);
    }
}
