import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        Integer max = 0;

        Integer min = 0;

        System.out.println("Por favor ingresa cinco numeros:\n");
        for (int i = 0; i<5; i++){

            System.out.println("Ingresa un numero");
            while (!numero.hasNextInt()) {

                System.out.println("Porfavor ingresa un número");

                numero.next();

            }

            int number = numero.nextInt();

            if(i == 0){

                max = number;

                min = number;
            }
            else{

                if(number>max){
                    max = number;
                }else{
                    if(number<min){
                        min = number;
                    }
                }

            }

        }

        System.out.println("El numero mas alto ingresado fue: "+max);

        System.out.println("El numero mas bajo ingresado fue: "+min);

    }

}
