package framework;

public abstract class AbstractJeu {

    public final void MethodeTemplate(){
        calculerScoreTour();
        calculerLeVainqueur();
    }

    public abstract void calculerScoreTour();
    public abstract void calculerLeVainqueur();


}
