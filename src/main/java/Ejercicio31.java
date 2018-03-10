import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        Integer opcMenu = 0 ;

        Integer numero1 = 0;

        Integer numero2 = 0;

        Integer operacion=0;

        System.out.println("Del siguiente menú ingrese el numero correspondiente a la opción deseada: ");
        System.out.print("1.-Sumar dos números\t\t2.-Restar dos numeros(el primero menos el segundo)\n3.-Multiplicar dos numeros\t\t4.-Dividir dos numeros(El primero entre el segundo");

        while (!inputs.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            inputs.next();

        }

        opcMenu = inputs.nextInt();

        while(opcMenu <=0 || opcMenu >=5){
            System.out.println("Por favor ingrese un numero valido (del 1 al 4)");
            while(!inputs.hasNextInt()){
                System.out.println("Por favor ingrese un numero");
                inputs.next();
            }
            opcMenu = inputs.nextInt();
        }
        System.out.println("Teniendo en cuenta la información adicional del menú,por favor ingrese su primer numero");

        while(!inputs.hasNextInt()){
            System.out.println("Por favor ingresa un numero");

            inputs.next();
        }

        numero1 = inputs.nextInt();

        System.out.println("Teniendo en cuenta la información adicional del menú,por favor ingrese su segundo numero");

        while(!inputs.hasNextInt()){
            System.out.println("Por favor ingresa un numero");

            inputs.next();
        }

        numero2 = inputs.nextInt();


        switch(opcMenu){
            case 1:

                operacion = numero1+numero2;

                System.out.println("El resultado de la operación es: ");

                System.out.println(numero1 + " + "+numero2+"="+ operacion );

                break;
            case 2:

                operacion = numero1-numero2;

                System.out.println("El resultado de la operación es: ");

                System.out.println(numero1 + " - "+numero2+"="+ operacion );

                break;
            case 3:

                operacion = numero1*numero2;

                System.out.println("El resultado de la operación es: ");

                System.out.println(numero1 + " x "+numero2+"="+ operacion );

                break;
            case 4:

                operacion = numero1/numero2;

                System.out.println("El resultado de la operación es: ");

                System.out.println(numero1 + " / "+numero2+"="+ operacion );

                break;


        }



    }
}
