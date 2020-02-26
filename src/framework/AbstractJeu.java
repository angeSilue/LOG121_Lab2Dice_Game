package framework;

public abstract class AbstractJeu {
    
    public void MethodeTemplate(){
        CalculerScoreTour();
        CalculerLeVainqueur();
    }
    
    public abstract void CalculerScoreTour();
    public abstract void CalculerLeVainqueur();


}
