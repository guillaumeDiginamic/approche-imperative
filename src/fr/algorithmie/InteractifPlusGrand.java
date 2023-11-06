package fr.algorithmie;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        // demande 10 nombres à un utilisateur et affiche le plus grand de ces nombres
        int[] nb = new int[10];
        Scanner scanner = new Scanner(System.in) ;

        for (int i=0; i< nb.length; i++) {
            System.out.print("entrer un nombre : ");
            nb[i] = scanner.nextInt() ;
        }
        // affiche le plus grand de ces nombres
        int max = nb[0];

        System.out.print("le plus grand des nombres : ");
        for (int i=0; i<nb.length; i++) {
            System.out.print(nb[i]+ " ");
            if (nb[i] > max) {
                max = nb[i];
            }
        }
        System.out.println("est "+max);



    }

}
