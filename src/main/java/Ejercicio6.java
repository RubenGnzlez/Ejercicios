import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Integer limite = 0;
        List<Integer> naturales = new ArrayList<>();

        System.out.println ("Introduce un número:");

        Scanner reader = new Scanner (System.in);

        limite = reader.nextInt();

        for(int i=0; i <= limite;i++){
            naturales.add(i);
        }
        for (Integer i : naturales){
            System.out.println(i);
        }
    }
}
