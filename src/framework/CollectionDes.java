package framework;

public class CollectionDes {
    static int taille = 1 ;
    static De[] desTab = new De[taille];

    public static void ajouterDe(De de){


        int i = desTab.length;
        desTab[i-1] = de;
        for(De d : desTab){
            System.out.println(d.idDes);
        }
        taille++;


    }
}
