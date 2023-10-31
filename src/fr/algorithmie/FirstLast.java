package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        //int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        //int[] array1 = {};
        int[] array1 = {4, 15, -3, 8, 7, 4, -2, 4};
        int size=array1.length;
        int count = 0;
        boolean bool = false;

        // calculer une valeur booléenne qui contrôle le tableau de la sorte
        // elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
        // elle vaut false dans les autres cas

        if (size > 0) {
            if (array1[0]==array1[size-1]) {
                bool =true;
            }
        }
        System.out.println("condition : "+bool);
    }

}
