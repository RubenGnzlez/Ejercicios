import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner numero= new Scanner(System.in);

        Integer num = 0;

        System.out.println("Ingresa un numero mayor o igual a 1 para sacar su factorial\n");

        while(!numero.hasNextInt()){

            System.out.println("Por favor ingresa un número");
            numero.next();
        }
        num = numero.nextInt();

        while(num<=0){
            while(!numero.hasNextInt()){

                System.out.println("Por favor ingresa un número");
                numero.next();
            }
            num = numero.nextInt();
        }

        System.out.println(factorial(num));

    }

    public static int factorial(Integer numero) {
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
    }

}

