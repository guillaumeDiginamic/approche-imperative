package fr.algorithmie;
import java.util.Scanner;

public class InteractifChiifresSuivants {
    public static void main(String[] args) {
        // demande un nombre à l’utilisateur puis qui affiche les 10 nombres suivants
        int nb = 0;
        System.out.println("entrer un nombre : ");
        Scanner scanner = new Scanner(System.in) ;
        nb = scanner.nextInt() ;

        // affiche les 10 nombres suivants
        System.out.println("10 nombres suivants de "+nb);
        for (int i=0; i<10; i++) {
            System.out.println(++nb);
        }



    }

}
