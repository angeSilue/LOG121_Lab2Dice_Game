package framework;

public class Jeu extends AbstractJeu {

    private int nbTours;
    private int tourActuel;
    private IStrategie strategie;
    private CollectionDes collectionDes;
    private CollectionJoueurs collectionJoueurs;

    public Jeu() {
        this(null, 0);
    }

    public Jeu(IStrategie strategie, int nbTours) {
        this.strategie = strategie;
        this.nbTours = nbTours;
        collectionJoueurs = new CollectionJoueurs();
        collectionDes = new CollectionDes();


    }




    @Override
    public void calculerScoreTour() {
        strategie.calculerScoreTour(this);
    }

    @Override
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

    public IStrategie getStrategie() {
        return strategie;
    }

    public void setStrategie(IStrategie strategie) {
        this.strategie = strategie;
    }

    public CollectionDes getCollectionDes() {
        return collectionDes;
    }

    public void setCollectionDes(CollectionDes collectionDes) {
        this.collectionDes = collectionDes;
    }

    public CollectionJoueurs getCollectionJoueurs() {
        return collectionJoueurs;
    }

    public void setCollectionJoueurs(CollectionJoueurs collectionJoueurs) {
        this.collectionJoueurs = collectionJoueurs;
    }
}
