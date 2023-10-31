package fr.algorithmie;

import javax.swing.*;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("Affichage tableau");
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("Affichage ordre inverse tableau");
        for (int i=array.length-1;i>=0; i--) {
            System.out.println(array[i]);
        }
        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        System.out.println("arrayCopy");
        int[] arrayCopy = new int[array.length];
        for (int i=array.length-1;i>=0; i--) {
            arrayCopy[i] = array[array.length-1-i];
        }
        // Afficher le tableau arrayCopy
        for (int i=0; i<arrayCopy.length; i++) {
            System.out.println(arrayCopy[i]);
        }
    }
}
