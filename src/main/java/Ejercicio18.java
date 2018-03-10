import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase;

        String letra;

        System.out.println("Ingresa una frase");

        frase = sc.nextLine();


        System.out.println("Ingresa una letra que quieres buscar en la frase dada");

        letra = sc.nextLine();

        // Contador de ocurrencias
        int contador = 0;

        while (frase.indexOf(letra) > -1) {
            frase = frase.substring(frase.indexOf(
                    letra)+letra.length(),frase.length());
            contador++;
        }
        System.out.println("La letra a buscar fue encontrada "+contador+" veces en la frase");


    }

}
