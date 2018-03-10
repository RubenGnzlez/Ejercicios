import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        String letra = "";

        Scanner reader = new Scanner(System.in);


        do {
            System.out.println("Introduzca S para continuar o N para salir");
            letra = reader.nextLine();

        }while(letra == "S");

    }
}
