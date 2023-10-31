package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        // demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10
        int nb = 0;
        while ( nb>10 || nb <1) {
            System.out.println("entrer un nombre compris entre 1 et 10 : ");
            Scanner scanner = new Scanner(System.in) ;
            nb = scanner.nextInt() ;
        }
        System.out.println("le nombre est : "+nb);


    }

}
