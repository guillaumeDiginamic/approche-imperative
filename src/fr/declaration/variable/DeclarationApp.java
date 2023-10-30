package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte byteA=12;
        short shortA = 128;
        int intA = 978646;
        long longA = 65464654;
        float floatA = 46541.31f;
        double doubleA = 68765464.55;
        char charA = 'E';
        boolean booleanA = true;
        String stringA = "string";

        System.out.printf("byteA="+byteA+" shortA =" +shortA+" intA ="+intA+ " longA = "+longA+"\n");
        System.out.printf("floatA="+floatA+" doubleA =" +doubleA+" charA ="+charA+"\n");
        System.out.printf(" booleanA = "+booleanA+" stringA = "+stringA);

        String randomString = "Voici le résultat d’un calcul : 1+5=6";
        System.out.println(randomString+"\n");
    }
}
