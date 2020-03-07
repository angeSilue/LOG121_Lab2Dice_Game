package framework;

public class Joueur implements Comparable<Joueur> {

    String nom;
    int scoreAccumule = 0;
    boolean vainqueur = false;
    //boolean tourPasse = false;

    public Joueur() {
        this("");
    }

    public Joueur(String nom) {
        this(nom, 0);
    }

    public Joueur(String nom, int scoreAccumule){
        this.nom = nom;
        this.scoreAccumule = scoreAccumule;
    }


    /**
     * https://www.javatpoint.com/Comparable-interface-in-collection-framework
     * @param j
     * @return
     */
    @Override
    public int compareTo(Joueur j) {
        if(j == null) {
            throw new IllegalArgumentException();
        }
        if(scoreAccumule == j.scoreAccumule) {
            return 0;
        }
        else if(scoreAccumule < j.scoreAccumule) {
            return 1;
        }
        else {
            return -1;
        }
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

