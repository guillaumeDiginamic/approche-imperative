package fr.algorithmie;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        // Faire un programme avec le menu suivant :
        //  1. Ajouter un nombre
        //  2. Afficher les nombres existants

        int option;
        int count = 0;
        int[] nb = new int[100];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu \n 1. Ajouter un nombre\n 2. Afficher les nombres existants. ");

            option = scanner.nextInt();
            if (option == 1) {
                // demande un nombre à l’utilisateur puis l’ajoute à un tableau
                System.out.println("entrer un nombre : ");

                nb[count] = scanner.nextInt() ;
                count++;
            } else {
                // affiche le contenu du tableau
                for (int i = 0; i < count; i++) {
                    System.out.println(nb[i]);
                }

            }
        } while (count< nb.length);
    }
}
