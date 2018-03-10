import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {

        List<Double> calificaciones = new ArrayList<>();

        Double n = 0.0;

        Double media = 0.0;

        Scanner inputs = new Scanner(System.in);

        System.out.println("Ingrese las calificaciónes (recuerde que van de un rango de 0 a 10)");

        for (int i = 1; i<=10; i++){
            System.out.println("Ingrese la calificación #"+i);
            while(!inputs.hasNextInt()){

                System.out.println("Por favor ingrese un numero");

                inputs.next();
            }

            n = inputs.nextDouble();

            while(n<0 || n>10){
                while(!inputs.hasNextInt()){

                    System.out.println("Por favor ingrese un numero entre 0 y 10 incluyendolos");

                    inputs.next();
                }

                n = inputs.nextDouble();
            }

            calificaciones.add(n);
        }



        for(int i = 0; i<10;i++){
            media = media + calificaciones.get(i);
        }
        media = media/10;
        System.out.println("La media de las calificaciones es: "+ media);
    }
}
