package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Quelle est la moyenne des éléments du tableau ?
        System.out.println("moyenne des éléments du tableau");
        int somme = 0;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            somme += array[i];
        }
        double moyenne = (double) somme / size;
        System.out.println(moyenne);
    }
}
