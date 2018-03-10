import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        Integer num = 0;

        Integer aux = 0;

        Scanner numero = new Scanner(System.in);

        System.out.println("Por favor ingresa un número.\n");


        while (!numero.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            numero.next();

        }

        num = numero.nextInt();

        for(int i = 1; i<(num+1);i++){

            if(num % i ==0 ){
                aux++;
            }
        }

        if(aux==2){
            System.out.println(num+"Es un numero primo");
        }
        else{
            System.out.println(num+"NO es un numero primo");
        }
    }
}
