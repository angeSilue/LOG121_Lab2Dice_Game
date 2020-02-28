package framework;

import java.util.Iterator;
import java.util.function.Consumer;

public class IterateurDe implements Iterator<De> {


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public De next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super De> action) {

    }
}
