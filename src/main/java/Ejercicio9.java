import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        System.out.println("Ingresa un número:\n");

        while (!numero.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            numero.next(); // this is important!

        }

        int number = numero.nextInt();

        if(number >0) {

            System.out.println("El número '" + number + "' es positivo.");

        }else if (number<0){

            System.out.println("El número '" + number + "' es negativo.");

        }

        else {

            System.out.println("El número '" + number + "' es neutral.");

        }

    }

}
