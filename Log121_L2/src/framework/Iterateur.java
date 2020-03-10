package framework;

public interface Iterateur<E> {
    boolean hasNext();
    E next();
    E currentItem();
    int getPosition();
}
