package framework;

import java.lang.reflect.Array;

public class CollectionJoueurs {

    static int taille = 1 ;
   static Joueur[] joueursTab = new Joueur[taille];

    public static void ajouterJoueurs(Joueur joueur){


            int i = joueursTab.length;
            joueursTab[i-1] = joueur;
            for(Joueur j : joueursTab){
                System.out.println(j.nom);
            }
        taille++;


    }
    public static void main(String[] args) {
        Joueur j = new Joueur("a",2,2);
        Joueur j1 = new Joueur("b",2,2);
        ajouterJoueurs(j);
        ajouterJoueurs(j1);
        ajouterJoueurs(j1);
        ajouterJoueurs(j1);
    }

}
