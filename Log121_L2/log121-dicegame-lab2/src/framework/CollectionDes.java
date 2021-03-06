package framework;


public class CollectionDes implements Liste<De> {
    private De[] listeDes;

    public CollectionDes(De[] listeDes) {
        this.listeDes = listeDes;
    }

    @Override
    public IterateurDe creerIterateur() {
        return new IterateurDe(listeDes);
    }

    public void ajouterDe(De de, int index){
        listeDes[index] = de;

    }

    public int getSize() {
        return listeDes.length;
    }

    public De getDe(int i) {
        return listeDes[i];
    }









}