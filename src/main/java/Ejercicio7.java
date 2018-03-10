import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        String frase = "";

        String res = "";

        List<String> frases = new ArrayList<>();

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce una frase ");

        frase = reader.nextLine();

        frases.add(frase);

        do {

            System.out.println("Deseas introducir otra frase? (S/N): ");

            res = reader.nextLine();

            if (res.equals("s") || res.equals("S")) {

                System.out.println("Introduce la frase");

                frase = reader.nextLine();

                frases.add(frase);

            }

        }while (res.equals("s") || res.equals("S"));


        System.out.println("añadiste "+ frases.size() + " frases");

    }
}
