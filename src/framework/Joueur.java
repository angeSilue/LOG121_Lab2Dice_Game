package framework;

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


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScoreTour() {
        return scoreTour;
    }

    public void setScoreTour(int scoreTour) {
        this.scoreTour = scoreTour;
    }

    public int getScoreAccumule() {
        return scoreAccumule;
    }

    public void setScoreAccumule(int scoreAccumule) {
        this.scoreAccumule = scoreAccumule;
    }

    public boolean isVainqueur() {
        return vainqueur;
    }

    public void setVainqueur(boolean vainqueur) {
        this.vainqueur = vainqueur;
    }
}

