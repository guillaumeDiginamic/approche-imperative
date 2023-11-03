package fr.algorithmie;

public class FabriquerMur {
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
    }
    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        int longueurBriqueSmall = 1;
        int longueurBriqueBig = 5;
        int resteBig = 0;
        int resteSmall = 0;
        int nbBriqueSmall = 0;
        int nbBriqueBig = 0;
            if (longueur >= longueurBriqueBig) {
                // on peut utiliser des grandes briques
                nbBriqueBig = longueur / longueurBriqueBig;
                resteBig = longueur % longueurBriqueBig;
                System.out.println("### 1 ### " + nbSmall + ", " + nbBig + ", " + longueur + ", nbBriqueBig = " + nbBriqueBig + ", resteBig = " + resteBig);
                if (resteBig >= longueurBriqueSmall) {
                    // on peut utiliser des petites briques
                    nbBriqueSmall = resteBig / longueurBriqueSmall;
                    resteSmall = resteBig % longueurBriqueSmall;
                    System.out.println("### 2 ### " + nbSmall + ", " + nbBig + ", " + longueur + ", nbBriqueSmall = " + nbBriqueSmall + ", resteSmall = " + resteSmall);
                    if (resteSmall == 0 && nbBriqueBig <= nbBig && nbBriqueSmall <= nbSmall) {
                        resultat = true;
                        System.out.println("### 3 ### " + nbSmall + ", " + nbBig + ", " + longueur + ", resultat = " + resultat);
                    }
                } else {
                    if (resteBig == 0 && nbBriqueBig <= nbBig && nbBriqueSmall <= nbSmall) {
                        resultat = true;
                        System.out.println("### 3 ### " + nbSmall + ", " + nbBig + ", " + longueur + ", resultat = " + resultat);
                    }

                }

            } else {
                resteSmall = longueur % longueurBriqueSmall;
                if (resteSmall == 0 && nbBriqueBig <= nbBig && nbBriqueSmall <= nbSmall) {
                    resultat = true;
                    System.out.println("### 4 ### " + nbSmall + ", " + nbBig + ", " + longueur + ", resultat = " + resultat);

                }
            }
            return resultat;
        }
        private static void verifier ( int nbSmall, int nbBig, int longueur, boolean b){
            if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
                System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
            } else {
                System.out.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") passant.");
            }
        }
    }
}
