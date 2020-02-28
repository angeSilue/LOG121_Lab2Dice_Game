package framework;

import java.util.Iterator;
import java.util.function.Consumer;

public class IterateurJoueur implements Iterator<Joueur> {


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Joueur next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super Joueur> action) {

    }
}
