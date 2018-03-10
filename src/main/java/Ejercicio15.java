import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        Integer max=0;

        Integer min=0;

        System.out.println("Por favor ingresa dos numeros:\n");
        for (int i = 0; i<2; i++){

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
                    min = number;
                }
            }
        }

        System.out.println("Segunb los numeros ingresados: Los numeros naturales entre "+min+" y "+max+" son:\n");
        for (int i = min; i<= max; i ++){

            if(i>=0){
                System.out.println(i);
            }
        }
    }

}
