package fr.algorithmie;
import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        // Demander à l’utilisateur de choisir un rang N
        // Ecrire un algorithme qui calcule et affiche le nombre de rang N de la suite de de Fibonacci
        // La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de rang N est égal à la somme des nombres de rangs N-1 et N-2

        int n = 10;
        int n0 = 0;
        int n1 = 1;
        int fibonacci = n0 + n1;

        // demande à l’utilisateur de choisir un rang N
        int nb = 0;
        System.out.println("choisir un rang N ");
        Scanner scanner = new Scanner(System.in) ;
        n = scanner.nextInt() ;

        for (int i=2; i<=n; i++) {
            fibonacci = fibonacci + i;
        }
        System.out.println("fibonacci : " + fibonacci + " pour "+ n);


    }
}
