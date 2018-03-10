import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        Integer opcMenu = 0 ;

        Integer numero1 = 0;

        Integer operacion=0;

        Integer aux = 0;


        System.out.println("Del siguiente menú ingrese el numero correspondiente a la opción deseada: ");
        System.out.print("1.-Ver si el numero es primo\t\t2.-Encontrar Factorial\n3.-Tabla de multiplicar(del 1 al 10)");

        while (!inputs.hasNextInt()) {

            System.out.println("Porfavor ingresa un número");

            inputs.next();

        }

        opcMenu = inputs.nextInt();

        while(opcMenu <=0 || opcMenu >=4){

            System.out.println("Por favor ingrese un numero valido (del 1 al 3)");

            while(!inputs.hasNextInt()){

                System.out.println("Por favor ingrese un numero");

                inputs.next();

            }

            opcMenu = inputs.nextInt();
        }
        System.out.println("Por favor ingrese el numero");

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



        switch(opcMenu){
            case 1:

                for(int i = 1; i<(numero1+1);i++){

                    if(numero1 % i ==0 ){
                        aux++;
                    }
                }

                if(aux==2){
                    System.out.println(numero1+"Es un numero primo");
                }
                else{
                    System.out.println(numero1+"NO es un numero primo");
                }
                break;
            case 2:

                while(numero1<=0){
                    while(!inputs.hasNextInt()){
                        System.out.println("Por favor ingresa un número para continuar");
                        inputs.next();
                    }
                    numero1 = inputs.nextInt();
                }

                break;
            case 3:

                for(int i = 1; i<=10; i++) {

                    System.out.println(numero1 + " x " + i + " = " + (numero1 * i));
                }

                break;

        }



    }
}
