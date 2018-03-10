import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner limite = new Scanner(System.in);

        System.out.println("Ingresa un número y veamos sus múltiplos de 3:\n");

        while (!limite.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            limite.next();

        }

        Integer contador = limite.nextInt();

        System.out.println("Son "+contador+" multiplos de 3 y son los siguientes:\n");

        for (int i = 0; i<contador;i++){
            System.out.println(i*3);
        }
    }
}
