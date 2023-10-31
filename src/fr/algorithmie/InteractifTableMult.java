package fr.algorithmie;
import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        // demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10
        int nb = 0;
        while ( nb>10 || nb <1) {
            System.out.println("entrer un nombre compris entre 1 et 10 : ");
            Scanner scanner = new Scanner(System.in) ;
            nb = scanner.nextInt() ;
        }
        // affiche la table de multiplication de ce nombre
        System.out.println("Table de "+nb);
        for (int i=1; i<=10; i++) {
            System.out.println(nb+" * "+i +" = "+(nb*i));
        }



    }

}
