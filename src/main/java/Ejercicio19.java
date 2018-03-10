import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args){

        Integer horas =0;

        Integer minutos = 0;

        Integer segundos = 0;

        Scanner numeros = new Scanner(System.in);


        System.out.println("Por favor ingrese la hora en un formato de 24hrs");

        while (!numeros.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            numeros.next();

        }

        horas = numeros.nextInt();

        while(horas < 0 || horas > 24){

            System.out.println("La hora debe ser entre 0 y 24");

            while (!numeros.hasNextInt()) {

                System.out.println("Porfavor ingresa u7n número");

                numeros.next();



            }


            horas = numeros.nextInt();
        }


        System.out.println("Por favor ingrese los minutos");

        while (!numeros.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            numeros.next();

        }

        minutos = numeros.nextInt();

        while(minutos<=0 || minutos>=60){

            System.out.println("Los minutos deben ser entre 0 y 60");

            while (!numeros.hasNextInt()) {

                System.out.println("Porfavor ingresa un número");

                numeros.next();



            }
            minutos = numeros.nextInt();

        }


        System.out.println("Por favor ingrese los segundos");

        while (!numeros.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            numeros.next();

        }

        segundos = numeros.nextInt();

        while(segundos<0 || segundos>60){

            System.out.println("Los segundos deben ser entre 0 y 60");

            while (!numeros.hasNextInt()){

                System.out.println("Porfavor ingresa un número");

                numeros.next();



            }

            segundos = numeros.nextInt();

        }


        System.out.println("Aquí esta el reloj: \n");


        System.out.println("La hora es"+horas+":"+minutos+":"+segundos);
    }

}
