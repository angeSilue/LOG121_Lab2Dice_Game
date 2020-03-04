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
        System.out.println("Le vainqueur est "+listeJoueur.get(0).getNom());
    }

    @Override
    public void calculerScoreTour(Jeu jeu) {
        Iterateur<De> iterateurDe = jeu.getListeDes().creerIterateur();
        int tourActuel = jeu.getTourActuel();
        Joueur joueurActuel = jeu.getJoueurActuel();
        int scoreAccumule = 0;
        int desIdentiquesTour = 0;
        boolean prochainJoueur = false;
        boolean troisDesIdentiques = false; //true si les 3 dés sont identiques, mais pas identiques au tour
        int premierChiffre = 0;

        ArrayList<De> listeDes = new ArrayList<>();
        System.out.println("Joueur actuel: "+joueurActuel.getNom());
        while(iterateurDe.hasNext()) {
            De de = iterateurDe.next();
            listeDes.add(de);
            Collections.sort(listeDes);
            scoreAccumule = joueurActuel.getScoreAccumule();
            if(de.getFaceActuelle() == tourActuel) {
                desIdentiquesTour++;
                prochainJoueur = false;
            }
            System.out.println("Nombre obtenu dans le Dé #"+de.getIdDe()+": "+de.getFaceActuelle());

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
            if(desIdentiquesTour == 0 && !troisDesIdentiques) {
                prochainJoueur = true;
            }


        }






    }






}
