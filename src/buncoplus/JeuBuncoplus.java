package buncoplus;

import framework.IStrategie;
import framework.Jeu;

public class JeuBuncoplus extends Jeu {


    public JeuBuncoplus() {
        this(null,0);
    }

    public JeuBuncoplus(IStrategie strategie, int nbTours) {
        super(strategie, nbTours);

        FabriqueBuncoplus fabriqueBuncoplus = new FabriqueBuncoplus();
        fabriqueBuncoplus.demarrerJeu();

    }







}
