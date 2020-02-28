package framework;

/**
 *  C'est la classe créatrice qui s'occupe de créer des instances des dés, des joueurs et d'un jeu.
 *  Le patron Template Method est utilisé.
 *  https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public abstract class Fabrique {

    private int nbJoueurs;
    private int nbDes;


    public final void demarrerJeu() {
        creerJoueurs();
        creerDes();
    }

    public abstract void creerJoueurs();
    public abstract void creerDes();





    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }

    public int getNbDes() {
        return nbDes;
    }

    public void setNbDes(int nbDes) {
        this.nbDes = nbDes;
    }
}
