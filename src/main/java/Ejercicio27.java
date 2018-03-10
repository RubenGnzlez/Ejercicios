import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {

        Integer amultiplicar =0;

        Scanner numeros = new Scanner(System.in);


        System.out.println("Por favor ingrese un numero entre 0 y 10");

        while (!numeros.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            numeros.next();

        }

        amultiplicar = numeros.nextInt();

        while(amultiplicar<0 || amultiplicar>10){
            System.out.println("El numero debe ser entre 0 y 10");

            while (!numeros.hasNextInt()) {

                System.out.println("Porfavor ingresa un número");

                numeros.next();
            }
            amultiplicar = numeros.nextInt();
        }

        System.out.println("Tabla del " + amultiplicar);

        for(int i = 1; i<=10; i++) {

            System.out.println(amultiplicar + " x " + i + " = " + (amultiplicar * i));
        }

    }


}
