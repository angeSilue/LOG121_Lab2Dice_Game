package framework;

public class Jeu extends AbstractJeu {

    private int nbTours;
    private IStrategie strategie;
    private CollectionDes collectionDes = new CollectionDes();
    private CollectionJoueurs collectionJoueurs = new CollectionJoueurs();



    public Jeu(IStrategie strategie, int nbTours) {
        this.strategie = strategie;
        this.nbTours = nbTours;

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
