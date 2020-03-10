package buncoplus;

import framework.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StrategieBuncoplus implements IStrategie {

    static Joueur[] joueursTab;
    static De[] desTab;
    int index  = 0;
    @Override
    public void calculerLeVainqueur(Jeu jeu) {


        CollectionJoueurs listeJoueur = new CollectionJoueurs(joueursTab);
        Iterateur<Joueur> iterateurJoueur = jeu.getListeJoueurs().creerIterateur();
        while(iterateurJoueur.hasNext()) {
            listeJoueur.ajouterJoueur(iterateurJoueur.next(),iterateurJoueur.getPosition());
        }
        Collections.sort((List)listeJoueur);
        for(int i = 0; i < listeJoueur.getSize(); i++) {
            System.out.println(listeJoueur.getJoueur(i).getNom()+" est en position #" +(i+1)+" avec "+listeJoueur.getJoueur(i).getScoreAccumule()+" points");
        }
        listeJoueur.getJoueur(0).setVainqueur(true);
        System.out.println("Le vainqueur est "+listeJoueur.getJoueur(0).getNom());
    }

    @Override
    public void calculerScoreTour(Jeu jeu) {
        Iterateur<De> iterateurDe = jeu.getListeDes().creerIterateur();
        Joueur joueurActuel = jeu.getJoueurActuel();
        int tourActuel = jeu.getTourActuel();
        int scoreAccumule = 0;
        int desIdentiquesTour = 0;
        int desIdentiquesAuPremier = 0;
        boolean troisDesIdentiques = false; //true si les 3 dés sont identiques, mais pas identiques au tour
        int premierChiffre = 0;
        ArrayList<De> listeDes = new ArrayList<>();
        while(iterateurDe.hasNext()) {
            De de = iterateurDe.next();
            listeDes.add(de);
            Collections.sort(listeDes);
            scoreAccumule = joueurActuel.getScoreAccumule();
            if(de.getFaceObtenue() == tourActuel) {
                desIdentiquesTour++;
                jeu.setProchainJoueur(false);
            }
            System.out.println("Nombre obtenu dans le Dé #"+de.getIdDe()+": "+de.getFaceObtenue());
            premierChiffre = listeDes.get(0).getFaceObtenue();
        }

        for(int i = 0; i < listeDes.size(); i++) {
            if(listeDes.get(i).getFaceObtenue() == premierChiffre) {
                desIdentiquesAuPremier++;
            }
        }

        if(desIdentiquesAuPremier == 3) {
            joueurActuel.setScoreAccumule(scoreAccumule + 5);
            troisDesIdentiques = true;
        }

        if(desIdentiquesTour == 3) {
            joueurActuel.setScoreAccumule(scoreAccumule + 21); //obtenu un Bunco
        }
        else if(desIdentiquesTour == 2) {
            joueurActuel.setScoreAccumule(scoreAccumule + 2);
        }
        else if(desIdentiquesTour == 1) {
            joueurActuel.setScoreAccumule(scoreAccumule + 1);
        }

        if(desIdentiquesTour == 0 && !troisDesIdentiques) {
            jeu.setProchainJoueur(true);
        }

    }
}
