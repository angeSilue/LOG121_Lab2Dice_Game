package framework;

/**
 *  C'est la classe créatrice qui s'occupe de créer des instances des dés, des joueurs et d'un jeu.
 *  Le patron Template est utilisé.
 *  https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public abstract class Fabrique {


    public final void demarrerJeu() {
        creerJeu();
        creerJoueurs();
        creerDes();

    }



    public abstract void creerJeu();


    public abstract void creerJoueurs();


    public abstract void creerDes();








}
