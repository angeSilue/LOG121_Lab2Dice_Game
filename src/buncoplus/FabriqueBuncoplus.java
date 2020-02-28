package buncoplus;

import framework.*;

public class FabriqueBuncoplus extends Fabrique {



    @Override
    public void creerJoueurs() {
        setNbJoueurs(5);
        CollectionJoueurs collectionJoueurs = new CollectionJoueurs();
        for(int i = 0; i < getNbJoueurs(); i++) {
            String playerNum = Integer.toString(i+1);
            collectionJoueurs.ajouterJoueur(new Joueur("player"+playerNum)); //ex nom: player1, player2
            //System.out.println(collectionJoueurs);
        }

    }

    @Override
    public void creerDes() {
        setNbDes(3);
        CollectionDes collectionDes = new CollectionDes();
        for(int i = 0; i < getNbDes(); i++) {
            int deID = i+1;
            collectionDes.ajouterDe(new De(6, deID));
            System.out.println(collectionDes);
        }


    }
}
