package fr.algorithmie;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        // Faire un programme avec le menu suivant :
        //  1. Ajouter un nombre
        //  2. Afficher les nombres existants

        int option;
        int count = 0;
        int size = 10;
        int plusSize = size;
        int[] nb = new int[size];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu \n 1. Ajouter un nombre\n 2. Afficher les nombres existants. ");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    // Ajouter un nombre
                    if (count >= size) {
                        // Si le tableau est plein, on l'agrandit
                        int[] tmp = new int[size +plusSize];

                        for (int i = 0; i < size; i++) {
                            tmp[i] = nb[i];
                        }
                        size = tmp.length;
                        nb =tmp;
                    }
                    // demande un nombre à l’utilisateur puis l’ajoute à un tableau
                    System.out.print("entrer un nombre : ");

                    nb[count] = scanner.nextInt() ;
                    count++;
                    break;
                case 2:
                    // Afficher les nombres existants
                    for (int i = 0; i < count; i++) {
                        System.out.println(nb[i]);
                    }
                    break;
            }
        } while (option!=2);
    }
}
