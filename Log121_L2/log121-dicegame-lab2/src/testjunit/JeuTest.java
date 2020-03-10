package testjunit;

import buncoplus.JeuBuncoplus;
import buncoplus.StrategieBuncoplus;
import framework.IStrategie;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JeuTest {

    JeuBuncoplus jeuBuncoplus;
    IStrategie strategie;


    @Before
    public void initialiserStrategie() {
        strategie = new StrategieBuncoplus();
    }


    @Test
    public void constructorJeuTest() {
        jeuBuncoplus = new JeuBuncoplus(strategie, 6);
    }


    








}