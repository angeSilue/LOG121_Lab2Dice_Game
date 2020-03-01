package testjunit;

import buncoplus.JeuBuncoplus;
import buncoplus.StrategieBuncoplus;
import framework.IStrategie;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JeuTest {

    JeuBuncoplus jeuBuncoplus;
    IStrategie strategie;



    @Test
    public void testConstructorJeu() {
        strategie = new StrategieBuncoplus();
        jeuBuncoplus = new JeuBuncoplus(strategie);
    }




}