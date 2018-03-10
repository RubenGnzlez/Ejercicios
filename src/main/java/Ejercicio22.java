import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String frase;

        System.out.println("Ingresa una frase que desees repetir");

        frase = sc.nextLine();

        System.out.println(frase);
        System.out.println("\t\t\t\t"+frase);
        System.out.println("\t\t\t\t\t\t\t\t"+frase);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t"+frase);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+frase);


    }

}
