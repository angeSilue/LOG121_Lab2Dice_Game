package framework;
<<<<<<< HEAD

public class Joueur implements Comparable<Joueur> {
    String nom;
    int scoreTour;
    int scoreAccumule;
    boolean vainqueur;

    Joueur(String nom, int scoreTour, int scoreAccumule){
        this.nom = nom;
        this.scoreTour= scoreTour;
        this.scoreAccumule = scoreAccumule;
    }


    @Override
    public int compareTo(Joueur j) {
        if(scoreAccumule ==j.scoreAccumule)
            return 0;
        else if(scoreAccumule>j.scoreAccumule)
            return 1;
        else
            return -1;
    }
}

