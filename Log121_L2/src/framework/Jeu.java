package framework;

/**
 * LOG121_LAB-2
 * Février 2020
 * Réalisé par Vincent Chang et Ange-Christian Silue.
 */
public class Jeu{

    private int nbTours;
    private int tourActuel = 0;
    private Joueur joueurActuel;
    private boolean finPartie = false;
    private boolean finTour = false;
    private IStrategie strategie;
    private CollectionDes listeDes;
    private CollectionJoueurs listeJoueurs;
    private boolean prochainJoueur = true;

    public Jeu() {
        this(null, 0);
    }

    public Jeu(IStrategie strategie, int nbTours) {
        this.strategie = strategie;
        this.nbTours = nbTours;
        listeJoueurs = Fabrique.getCollectionJoueurs();
        listeDes = Fabrique.getCollectionDes();
    }

    /**
     * Joue une partie
     */
    public void deroulementPartie() {
        while(!finPartie) {
            jouerTour();
            if(tourActuel >= nbTours) {
                finPartie = true;
                calculerLeVainqueur();
            }
        }
    }

    /**
     *
     * https://stackoverflow.com/questions/31080272/java-iterator-get-next-without-incrementing
     */
    public void jouerTour() {
        tourActuel++;
        System.out.println("\n"+"DEBUT DU TOUR #"+tourActuel);
        System.out.println("__________________________________________________________________");
        Iterateur<Joueur> iterateurJoueur = listeJoueurs.creerIterateur();
        Joueur joueurPrecedent = listeJoueurs.getJoueur(0);

        while(iterateurJoueur.hasNext()) {
            if(!prochainJoueur) {
                joueurActuel = joueurPrecedent;
                System.out.println("C'est encore le tour de: "+joueurActuel.getNom());
                Iterateur<De> iterateurDe = listeDes.creerIterateur();
                while(iterateurDe.hasNext()) {
                    De de = iterateurDe.next();
                    de.brasserDe();
                }
                calculerScoreTour();
            }
            else if(prochainJoueur) {
                joueurActuel = iterateurJoueur.next();
                System.out.println("C'est maintenant le tour de: "+joueurActuel.getNom());
                Iterateur<De> iterateurDe = listeDes.creerIterateur();
                while(iterateurDe.hasNext()){
                    De de = iterateurDe.next();
                    de.brasserDe();
                }
                calculerScoreTour();
                joueurPrecedent = joueurActuel;
                if(!iterateurJoueur.hasNext()) {
                    while(!prochainJoueur) {
                        joueurActuel = joueurPrecedent;
                        System.out.println("C'est encore le tour de: "+joueurActuel.getNom());
                        iterateurDe = listeDes.creerIterateur();
                        while(iterateurDe.hasNext()) {
                            De de = iterateurDe.next();
                            de.brasserDe();
                        }
                        calculerScoreTour();
                    }
                }
            }

        }

        //Pour voir le score des joueurs à la fin d'un tour
        System.out.println("FIN DU TOUR #"+tourActuel);
        System.out.println("\n=======================================================================================");
        for(int i = 0; i < listeJoueurs.getSize(); i++) {
            System.out.println(listeJoueurs.getJoueur(i).getNom()+" a accumulé "+listeJoueurs.getJoueur(i).getScoreAccumule()+ " points");
        }
        System.out.println("=======================================================================================");

    }


    public void calculerScoreTour() {
        strategie.calculerScoreTour(this);
    }

    public void calculerLeVainqueur() {
        strategie.calculerLeVainqueur(this);
    }



    public int getNbTours() {
        return nbTours;
    }

    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }

    public int getTourActuel() {
        return tourActuel;
    }

    public void setTourActuel(int tourActuel) {
        this.tourActuel = tourActuel;
    }

    public Joueur getJoueurActuel() {
        return joueurActuel;
    }

    public void setJoueurActuel(Joueur joueurActuel) {
        this.joueurActuel = joueurActuel;
    }

    public boolean isFinPartie() {
        return finPartie;
    }

    public void setFinPartie(boolean finPartie) {
        this.finPartie = finPartie;
    }

    public boolean isFinTour() {
        return finTour;
    }

    public void setFinTour(boolean finTour) {
        this.finTour = finTour;
    }

    public IStrategie getStrategie() {
        return strategie;
    }

    public void setStrategie(IStrategie strategie) {
        this.strategie = strategie;
    }

    public CollectionDes getListeDes() {
        return listeDes;
    }

    public void setListeDes(CollectionDes listeDes) {
        this.listeDes = listeDes;
    }

    public CollectionJoueurs getListeJoueurs() {
        return listeJoueurs;
    }

    public void setListeJoueurs(CollectionJoueurs listeJoueurs) {
        this.listeJoueurs = listeJoueurs;
    }

    public boolean isProchainJoueur() {
        return prochainJoueur;
    }

    public void setProchainJoueur(boolean prochainJoueur) {
        this.prochainJoueur = prochainJoueur;
    }
}