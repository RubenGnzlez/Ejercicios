import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);


        System.out.println("Ingresa un número y veamos si es par:\n");

        while (!numero.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            numero.next();

        }

        int number = numero.nextInt();

        if(number % 2 == 0){
            System.out.println("Ingresaste el número "+number+" y es un número par.");
        }
        else{
            System.out.println("Ingresaste el número "+number+" y es un número impar.");
        }
    }

}
