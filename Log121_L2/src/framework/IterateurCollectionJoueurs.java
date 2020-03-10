package framework;

import java.util.Iterator;
import java.util.function.Consumer;

public class IterateurCollectionJoueurs implements Iterateur<Joueur> {

    private CollectionJoueurs cJoueurs;
    private int position;

    public IterateurCollectionJoueurs(CollectionJoueurs cJoueurs){
        this.cJoueurs = cJoueurs;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < cJoueurs.getLength();
    }

    @Override
    public Joueur next() {
        return cJoueurs.getJoueur(position++);
    }

    @Override
    public Joueur currentItem() {
        return cJoueurs.getJoueur(position);
    }

    @Override
    public int getPosition() {
        return position;
    }
}
