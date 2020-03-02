package buncoplus;

import framework.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StrategieBuncoplus implements IStrategie {


    @Override
    public void calculerLeVainqueur(Jeu jeu) {
        ArrayList<Joueur> listeJoueur = new ArrayList<>();
        Iterateur<Joueur> iterateurJoueur = jeu.getListeJoueurs().creerIterateur();
        while(iterateurJoueur.hasNext()) {
            listeJoueur.add(iterateurJoueur.next());
        }
        Collections.sort(listeJoueur);
        for(int i = 0; i < listeJoueur.size(); i++) {
            System.out.println(listeJoueur.get(i).getNom()+" est en position #" +(i+1)+" avec "+listeJoueur.get(i).getScoreAccumule()+" points");
        }

        listeJoueur.get(0).setVainqueur(true);

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
