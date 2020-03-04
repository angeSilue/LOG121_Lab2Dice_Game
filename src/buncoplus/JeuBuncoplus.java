package buncoplus;

import framework.Fabrique;
import framework.IStrategie;
import framework.Jeu;

public class JeuBuncoplus extends Jeu {

    //private static final int nbTours = 6;

    public JeuBuncoplus(IStrategie strategie, int nbTours) {
        super(strategie, nbTours);
    }

}
