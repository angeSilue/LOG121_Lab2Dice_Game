package framework;


/**
 * Cette classe est adaptée de l'exemple de patron iterateur donné par le site:
 * https://howtodoinjava.com/design-patterns/behavioral/iterator-design-pattern/
 *
 */
public class IterateurJoueur implements Iterateur<Joueur> {

    private Joueur[] listeJoueurs;
    private int position;

    public IterateurJoueur(Joueur[] listeJoueurs) {
        this.listeJoueurs = listeJoueurs;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position >= listeJoueurs.length) {
            return false;
        }
        return true;
    }

    @Override
    public Joueur next() {
        return listeJoueurs[position++];
    }

    @Override
    public Joueur currentItem() {
        return listeJoueurs[position];
    }


}
