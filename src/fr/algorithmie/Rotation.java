package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {

        int[] array1 = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size=array1.length;
        int last = array1[size -1];

        // rotation à droite des éléments.
        for (int i = size - 1; i >= 0; i--) {
           if (i == 0) {
                array1[i] = last;
           } else {
                array1[i] = array1[i-1];
           }
        }
        System.out.println("tableau aprés rotation à droite des éléments");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
