package framework;


public class CollectionJoueurs implements Liste<Joueur>{

    //private ArrayList<Joueur> listeJoueurs;
    private Joueur[] listeJoueurs;

    public CollectionJoueurs(Joueur[] listeJoueurs) {
        this.listeJoueurs = listeJoueurs;
    }

    @Override
    public IterateurJoueur creerIterateur() {
        return new IterateurJoueur(listeJoueurs);
    }

    public void ajouterJoueur(Joueur joueur, int index){
        listeJoueurs[index] = joueur;
    }



    public int getSize() {
        return listeJoueurs.length;
    }

    public Joueur getJoueur(int i) {
        return listeJoueurs[i];
    }






}
