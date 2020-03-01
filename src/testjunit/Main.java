package testjunit;

import buncoplus.FabriqueBuncoplus;
import buncoplus.JeuBuncoplus;
import buncoplus.StrategieBuncoplus;
import framework.Fabrique;

public class Main {

    public static void main(String[] args) {
        Fabrique fabrique = new FabriqueBuncoplus(new JeuBuncoplus(new StrategieBuncoplus()));
    }
}
