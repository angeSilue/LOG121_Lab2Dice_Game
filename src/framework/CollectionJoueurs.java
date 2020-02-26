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

}
