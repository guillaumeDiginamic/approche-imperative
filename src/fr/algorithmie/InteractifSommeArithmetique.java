package fr.algorithmie;
import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        // demande un nombre à l’utilisateur puis calcule la somme de tous les entiers compris entre 1 et ce nombre
        int nb = 0;
        int somme = 0;
        System.out.println("entrer un nombre supèrieur à 0 : ");
        Scanner scanner = new Scanner(System.in) ;
        nb = scanner.nextInt() ;

        // somme de tous les entiers compris entre 1 et ce nombre.
        System.out.println("somme de tous les entiers compris entre 1 et "+nb);
        for (int i=1; i<=nb; i++) {
            somme = somme + i;
        }
        System.out.println(somme);



    }

}
