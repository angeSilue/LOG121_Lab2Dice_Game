package framework;

import java.util.Iterator;

public class IterateurCollectionDes implements Iterateur<De> {

    private CollectionDes cDes;
    private int position;

    public IterateurCollectionDes(CollectionDes cDes)
    {
        this.cDes = cDes;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < cDes.getSize();
    }

    @Override
    public De next() {
        return cDes.getDe(position++);
    }

    @Override
    public De currentItem() {
        return cDes.getDe(position);
    }

    @Override
    public int getPosition() {
        return position;
    }


}
