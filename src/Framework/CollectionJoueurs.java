package Framework;

import java.lang.reflect.Array;

public class CollectionJoueurs {

    static int taille = 1 ;
   static Joueurs[] joueursTab = new Joueurs[taille];

    public static void ajouterJoueurs(Joueurs joueurs){


            int i = joueursTab.length;
            joueursTab[i-1] = joueurs;
            for(Joueurs j : joueursTab){
                System.out.println(j.nom);
            }
        taille++;


    }
    public static void main(String[] args) {
        Joueurs j = new Joueurs("a",2,2);
        Joueurs j1 = new Joueurs("b",2,2);
        ajouterJoueurs(j);
        ajouterJoueurs(j1);
        ajouterJoueurs(j1);
        ajouterJoueurs(j1);
    }

}
