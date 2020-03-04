package testjunit;

import buncoplus.FabriqueBuncoplus;
import buncoplus.JeuBuncoplus;
import buncoplus.StrategieBuncoplus;
import framework.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FabriqueTest {

    FabriqueBuncoplus fabrique;


    @Test
    public void testConstructorFabrique() {
        fabrique = new FabriqueBuncoplus(new JeuBuncoplus(new StrategieBuncoplus(), 6));
    }

    @Test
    public void testCreerJoueurs() {
//        Joueur[] listeJoueurs = new Joueur[6];
//        CollectionJoueurs collectionJoueurs = new CollectionJoueurs(listeJoueurs);
//        collectionJoueurs = Fabrique.getCollectionJoueurs();
//        System.out.println(collectionJoueurs);
//        assertEquals(5, collectionJoueurs.getSize());
//        assertEquals("player1", collectionJoueurs.getJoueur(0).getNom());
//        assertEquals("player2", collectionJoueurs.getJoueur(1).getNom());
//        assertEquals("player3", collectionJoueurs.getJoueur(2).getNom());
//        assertEquals("player4", collectionJoueurs.getJoueur(3).getNom());
//        assertEquals("player5", collectionJoueurs.getJoueur(4).getNom());
    }

    @Test
    public void testCreerDes() {
//        De[] listeDes = new De[3];
//        CollectionDes collectionDes = new CollectionDes(listeDes);
//        collectionDes = Fabrique.getCollectionDes();
//        assertEquals(3, collectionDes.getSize());
//        assertEquals(1, collectionDes.getDe(0).getIdDe());
//        assertEquals(2, collectionDes.getDe(1).getIdDe());
//        assertEquals(3, collectionDes.getDe(2).getIdDe());
    }




}
