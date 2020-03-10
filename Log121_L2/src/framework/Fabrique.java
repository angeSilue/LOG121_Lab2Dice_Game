package framework;

/**
 *  C'est la classe créatrice qui s'occupe de créer les instances de dés, de joueurs.
 *  Le patron Template Method est utilisé.
 *  https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public abstract class Fabrique {

    private static CollectionJoueurs collectionJoueurs;
    private static CollectionDes collectionDes;

    /**
     * Cette méthode Template remplit les listes de joueurs et de dés de l'instance du jeu,
     * et démarre la partie.
     */
    public final void demarrerJeu(Jeu jeu) {
        jeu.setListeJoueurs(creerJoueurs());
        jeu.setListeDes(creerDes());
        jeu.deroulementPartie();
    }

    public abstract CollectionJoueurs creerJoueurs();

    public abstract CollectionDes creerDes();


    public static CollectionJoueurs getCollectionJoueurs() {
        return collectionJoueurs;
    }

    public void setCollectionJoueurs(CollectionJoueurs collectionJoueurs) {
        Fabrique.collectionJoueurs = collectionJoueurs;
    }

    public static CollectionDes getCollectionDes() {
        return collectionDes;
    }

    public static void setCollectionDes(CollectionDes collectionDes) {
        Fabrique.collectionDes = collectionDes;
    }
}
