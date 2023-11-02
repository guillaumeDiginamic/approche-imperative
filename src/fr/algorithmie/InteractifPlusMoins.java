package fr.algorithmie;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        // jeu qui :
        //  - choisit un nombre aléatoire entre 1 et 100
        //  - puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou en dessous du nombre,
        //  - Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur
        //  - le programme se termine.

        int nombreAleatoire = (int)(Math.random() * ((100) + 1));
        int nb;
        int count=0;
        System.out.println("nombre à trouver: "+nombreAleatoire);

        do  {
            System.out.println("entrer un nombre : ");
            Scanner scanner = new Scanner(System.in) ;
            nb = scanner.nextInt() ;

            if (nb > nombreAleatoire) {
                // il est au-dessus
                System.out.println(nb + " est au dessus");
            } else if (nb < nombreAleatoire) {
                // il est au-dessus
                System.out.println(nb + " est au dessous");
            }
            count++;
        } while (nb != nombreAleatoire);

        System.out.println("Bravo, vous avez trouvé en "+ count +" coups ");
    }

}
