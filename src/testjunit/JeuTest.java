package testjunit;

import buncoplus.StrategieBuncoplus;
import framework.IStrategie;
import framework.Jeu;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class JeuTest {

    @BeforeEach
    void setUp() {
        IStrategie strategie = new StrategieBuncoplus();
        Jeu jeu = new Jeu(strategie, 6);

    }








}