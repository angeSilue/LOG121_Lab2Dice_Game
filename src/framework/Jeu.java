package framework;


public class Jeu{

    private int nbTours;
    private int tourActuel = 0;
    private boolean finPartie = false;
    private boolean finTour = false;
    private IStrategie strategie;
    private CollectionDes listeDes;
    private CollectionJoueurs listeJoueurs;
    private Iterateur<Joueur> iterateurJoueur;
    private Iterateur<De> iterateurDe;

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
        System.out.println("La partie a commencé!");
        while(!finPartie) {
            jouerTour();
            if(tourActuel >= nbTours) {
                finPartie = true;
                calculerLeVainqueur();
            }
        }

    }

    public void jouerTour() {
        tourActuel++;
        System.out.println("\n"+"Tour: "+tourActuel);
        System.out.println("__________________________________________________________________");
        iterateurJoueur = listeJoueurs.creerIterateur();
        while(iterateurJoueur.hasNext()) {
            Joueur joueur = iterateurJoueur.next();
            iterateurDe = listeDes.creerIterateur();
            System.out.println(joueur.getNom() + " brasse les dés: ");
            while(iterateurDe.hasNext()) {
                De de = iterateurDe.next();
                de.brasserDe();
                System.out.println("Nombre obtenu dans le Dé #"+de.getIdDe()+": "+de.getFaceActuelle());
            }
            calculerScoreTour();
        }


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


}
