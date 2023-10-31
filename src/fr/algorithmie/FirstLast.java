package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        //int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        //int[] array1 = {};
        //int[] array1 = {6, 15, -3, 8, 7, 4, -2, 28};
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6} ;
        int size=array1.length;
        int count = 0;
        boolean bool = false;

        // calculer une valeur booléenne qui contrôle le tableau de la sorte
        // elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
        // elle vaut false dans les autres cas

        if (size > 0) {
            if ((array1[0]==6) || (array1[size-1]==6)) {
                bool =true;
            }
        }
        System.out.println("condition : "+bool);
    }

}
