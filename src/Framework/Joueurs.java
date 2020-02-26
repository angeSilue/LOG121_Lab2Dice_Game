package Framework;

public class Joueurs implements Comparable<Joueurs> {
    String nom;
    int scoreTour;
    int scoreAccumule;
    boolean vainqueur;

    Joueurs(String nom, int scoreTour, int scoreAccumule){
        this.nom = nom;
        this.scoreTour= scoreTour;
        this.scoreAccumule = scoreAccumule;
    }


    @Override
    public int compareTo(Joueurs j) {
        if(scoreAccumule ==j.scoreAccumule)
            return 0;
        else if(scoreAccumule>j.scoreAccumule)
            return 1;
        else
            return -1;
    }
}

