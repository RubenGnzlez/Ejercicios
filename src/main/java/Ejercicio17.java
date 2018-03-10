import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main (String[] args){

        Integer num1 = 0;

        Integer num2 = 0;

        Integer contador = 0;

        Integer suma = 0;

        List<Integer> multiplos = new ArrayList<>();

        Scanner numero = new Scanner(System.in);

        System.out.println("Por favor ingresa dos numeros,recuerda que el segundo deberá ser mayor o igual al primero.\n");

        System.out.println("Ingresa tu primer numero:");

        while (!numero.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            numero.next();

        }

        num1 = numero.nextInt();

        System.out.println("Ingresa tu segundo numero:");

        while (!numero.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            numero.next();

        }

        num2 = numero.nextInt();

        while(num2<num1){

            System.out.println("Por favor ingresa un numero mayor o igual a "+num1);

            while (!numero.hasNextInt()) {

                System.out.println("Porfavor ingresa un número");

                numero.next();

            }

            num2 = numero.nextInt();

        }




        for (int i = num1; i<= num2; i ++){

            if (i % 2 == 0) {

                multiplos.add(i);

                contador++;

                suma = suma+i;

            }
        }


        System.out.println("Segun los numeros ingresados,Los multiplos de dos entre "+num1+" y "+num2+" fueron "+contador+" y son los siguientes\n");

        multiplos.stream().forEach((Integer i)->{

            System.out.println(i);

        });

        System.out.println("La suma de todos los mencionados es de: "+suma);
    }

}
