package fr.algorithmie;
import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {
        // jeu qui :
        // 21 allumettes sont placées entre les deux joueurs.
        // Les joueurs tirent chacun leur tour 1, 2 ou 3 allumettes au choix.
        // Le joueur qui tire la dernière allumette a perdu.

        int nbAleatoire ;
        int nb;
        int nbAllumettes=21;

        Scanner scanner = new Scanner(System.in) ;
        do {
            if (nbAllumettes > 3) {
                do {
                    System.out.println("entrer un nombre compris entre 1 et 3");
                    nb = scanner.nextInt();
                } while (nb < 1 || nb > 3);
            } else {
                do {
                    System.out.println("entrer un nombre compris entre 1 et " + nbAllumettes);
                    nb = scanner.nextInt();
                } while (nb < 1 || nb > nbAllumettes);
            }
            // enlève allumettes joueur
            nbAllumettes -= nb;
            System.out.println("vous avez enlevé " + nb + " allumettes, il en reste " + nbAllumettes);

            if (nbAllumettes == 1) {
                // il reste 1 allumette après que l'utilisateur enleve des allumettes, l'utilisateur a gagné
                System.out.println("il ne reste qu'une allumette, vous avez gagné");
            } else {
                if (nbAllumettes > 3) {
                    // il reste plus que 3 allumettes, l'ordinateur enlève entre 1 t 3 allumettes
                    nbAleatoire = 1 + (int) (Math.random() * ((3 - 1) + 1));
                    nbAllumettes -= nbAleatoire;
                    System.out.println("l'ordinateur a enlevé " + nbAleatoire + " allumettes, il en reste " + nbAllumettes);
                } else {
                    // il reste entre 2 et 3 allumettes, l'ordinateur enlève entre 1 t 3 allumettes
                    // l'ordinateur entre 1 et nbAllumettes-1 allumettes
                        nbAleatoire = 1 + (int) (Math.random() * ((nbAllumettes - 1) + 1));
                        nbAllumettes -= nbAleatoire;
                        System.out.println("l'ordinateur a enlevé " + nbAleatoire + " allumettes, il en reste " + nbAllumettes);
                }
                if (nbAllumettes == 1) {
                    // il reste 1 allumette, après que l'ordinateur enleve des allumettes, l'ordinateur a gagné
                    System.out.println("il ne reste qu'une allumette, l'ordinateur a gagné");
                }
            }
        } while (nbAllumettes !=1);
    }
}
