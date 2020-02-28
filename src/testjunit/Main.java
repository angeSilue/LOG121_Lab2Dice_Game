package testjunit;

import buncoplus.JeuBuncoplus;
import buncoplus.StrategieBuncoplus;
import framework.IStrategie;
import framework.Jeu;

public class Main {

    public static void main(String[] args) {

        IStrategie strategie = new StrategieBuncoplus();
        Jeu jeu = new JeuBuncoplus(strategie, 6);




    }
}
