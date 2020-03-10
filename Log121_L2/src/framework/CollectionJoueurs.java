package framework;

import java.lang.reflect.Array;
import java.util.List;

public class CollectionJoueurs implements Liste<Joueur>{

    static int taille = 1 ;

   static Joueur[] listeJoueurs;

   public CollectionJoueurs(Joueur[] joueurs){
       this.listeJoueurs = joueurs;
   }

    public int getLength(){

       return listeJoueurs.length;
    }

    @Override
    public IterateurCollectionJoueurs creerIterateur() {
        return new IterateurCollectionJoueurs(this);
    }

    public void ajouterJoueur(Joueur joueur, int index){
        listeJoueurs[index] = joueur;
    }



    public int getSize() {
        return listeJoueurs.length;
    }

    public Joueur getJoueur(int i) {
        return listeJoueurs[i];
    }

}
