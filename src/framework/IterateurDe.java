package framework;


/**
 * Cette classe est adaptée de l'exemple de patron iterateur donné par le site:
 * https://howtodoinjava.com/design-patterns/behavioral/iterator-design-pattern/
 *
 */
public class IterateurDe implements Iterateur<De> {
    private De[] listeDes;
    private int position;

    public IterateurDe(De[] listeDes) {
        this.listeDes = listeDes;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position >= listeDes.length) {
            return false;
        }
        return true;
    }

    @Override
    public De next() {
        return listeDes[position++];
    }

    @Override
    public De currentItem() {
        return listeDes[position];
    }


}
