package fr.algorithmie;

public class FabriquerMur {
    private static int resteBig;

    public static void main(String[] args) {

        // Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
        verifier(7, 1, 4, true);
        verifier(7, 2, 12, true);


    }
    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        int longueurBriqueSmall = 1;
        int longueurBriqueBig = 5;
        int resteBig = 0;
        int resteSmall = 0;
        int nbBriqueSmall = 0;
        int nbBriqueBig = 0;
        int nbMaxBriqueBig = 0;
        int count = 0;
        System.out.println("\n nbSmall = "+ nbSmall + " nbBig =  " + nbBig + " longueur = " + longueur);

        if (longueur >= longueurBriqueBig) {
            // on peut utiliser des grandes briques
            nbMaxBriqueBig = longueur / longueurBriqueBig;
            for (nbBriqueBig=1; nbBriqueBig <= nbMaxBriqueBig; nbBriqueBig++) {
                // pour toutes les possibilités de nombre de grandes briques
                nbBriqueSmall = 0;
                resteBig = longueur - (longueurBriqueBig * nbBriqueBig); // reste utilisation des grandes briques
                if (resteBig >= longueurBriqueSmall) {
                    // le reste est plus grand que la longueur d'une petite brique
                    // on peut utiliser des petites briques
                    nbBriqueSmall = resteBig / longueurBriqueSmall; // nombre de petites briques necessaires
                    resteSmall = resteBig % longueurBriqueSmall; // reste aprés utilisation des grandes et petites briques
                    if (resteSmall == 0 && nbBriqueBig <= nbBig && nbBriqueSmall <= nbSmall) {
                        // longueur atteinte et nombre de petites et grandes briques suffisantes
                        count++;
                        System.out.println("   combinaison possible " + count + " : " + nbBriqueSmall + " petite(s) brique(s), " + nbBriqueBig + " grande(s) brique(s) pour la longueur de " + longueur);
                    }
                } else {
                    // le reste est plus petit que la longueur d'une petite brique
                    // on ne peut pas utiliser des petites briques
                    if (resteBig == 0 && nbBriqueBig <= nbBig && nbBriqueSmall <= nbSmall) {
                        // longueur atteinte et nombre de petites et grandes briques suffisantes
                        count++;
                        System.out.println("   combinaison possible " + count + " : " + nbBriqueSmall + " petite(s) brique(s), " + nbBriqueBig + " grande(s) brique(s) pour la longueur de " + longueur);
                    }
                }
            }
        } else {
            // on ne peut pas utiliser des grandes briques
            nbBriqueSmall = longueur / longueurBriqueSmall; // nombre de petites briques necessaires
            resteSmall = longueur % longueurBriqueSmall; // reste aprés utilisation des petites briques
            if (resteSmall == 0 && nbBriqueSmall <= nbSmall) {
                // longueur atteinte et nombre de petites briques suffisantes
                count++;
                System.out.println("   combinaison possible "+count+" : " + nbBriqueSmall + " petite(s) brique(s) pour la longueur de " + longueur);                        }
            }
        if (count!=0) {
             resultat = true;

        } else {
            System.out.println("   pas de combinaison possible ");

        }
        return resultat;
    }
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        }
    }
}
