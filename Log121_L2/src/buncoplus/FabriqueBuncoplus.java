package buncoplus;
import framework.*;

    public class FabriqueBuncoplus extends Fabrique {

        private final int NBRE_JOUEURS = 5;
        private final int NBRE_DES = 3;
        private static CollectionJoueurs collectionJoueurs;
        private static CollectionDes collectionDes;

        public FabriqueBuncoplus(Jeu jeu) {
            demarrerJeu(jeu);
        }

        @Override
        public CollectionJoueurs creerJoueurs() {
            Joueur[] listeJoueurs = new Joueur[NBRE_JOUEURS];
            collectionJoueurs = new CollectionJoueurs(listeJoueurs);
            for(int i = 0; i < listeJoueurs.length; i++) {
                String playerNum = Integer.toString(i+1); //ex nom: player1, player2
                collectionJoueurs.ajouterJoueur(new Joueur("PLAYER_"+playerNum), i);
            }
            return collectionJoueurs;
        }

        @Override
        public CollectionDes creerDes() {
            De[] listeDes = new De[NBRE_DES];
            collectionDes = new CollectionDes(listeDes);
            for(int i = 0; i < listeDes.length; i++) {
                int deID = i+1;
                collectionDes.ajouterDe(new De(6, deID), i);
            }
            return collectionDes;
        }

        public int getNBRE_JOUEURS() {
            return NBRE_JOUEURS;
        }

        public int getNBRE_DES() {
            return NBRE_DES;
        }

        public static void setCollectionDes(CollectionDes collectionDes) {
            FabriqueBuncoplus.collectionDes = collectionDes;
        }

        public static CollectionJoueurs getCollectionJoueurs() {
            return collectionJoueurs;
        }

        public static CollectionDes getCollectionDes() {
            return collectionDes;
        }
    }

