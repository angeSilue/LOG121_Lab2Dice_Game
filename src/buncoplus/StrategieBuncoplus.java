package buncoplus;

import framework.*;

public class StrategieBuncoplus implements IStrategie {


    @Override
    public void calculerLeVainqueur(Jeu jeu) {
        //TODO

    }

    @Override
    public void calculerScoreTour(Jeu jeu) {
        Iterateur<De> iterateurDe = jeu.getListeDes().creerIterateur();
        int tourActuel = jeu.getTourActuel();
        Joueur joueurActuel = jeu.getJoueurActuel();
        int scoreAccumule = 0;
        int desIdentiquesTour = 0;
        boolean prochainJoueur = false;

        while(iterateurDe.hasNext()) {
            De de = iterateurDe.next();
            scoreAccumule = joueurActuel.getScoreAccumule();
            if(de.getFaceActuelle() == tourActuel) {
                desIdentiquesTour++;
                prochainJoueur = false;
            }
        }

        if(!prochainJoueur) {
            if(desIdentiquesTour == 3) {
                joueurActuel.setScoreAccumule(scoreAccumule + 21); //obtenu un Bunco
            }
            else if(desIdentiquesTour == 2) {
                joueurActuel.setScoreAccumule(scoreAccumule + 2);
            }
            else if(desIdentiquesTour == 1) {
                joueurActuel.setScoreAccumule(scoreAccumule + 1);
            }

        }

        if(desIdentiquesTour == 0) {
            prochainJoueur = true;
        }

    }






}
