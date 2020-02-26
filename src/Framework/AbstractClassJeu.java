package Framework;

public abstract class AbstractClassJeu {
    public void MethideTemplate(){
        CalculerScoreTour();
        CalculerLeVainqueur();
    }
    public abstract void CalculerScoreTour();
    public abstract void CalculerLeVainqueur();


}
