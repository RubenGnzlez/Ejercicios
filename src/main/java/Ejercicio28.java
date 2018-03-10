import java.util.Random;

public class Ejercicio28 {

    public static void main(String[] args) {

        Random rnd = new Random();

        System.out.println("Tiraremos una moneda al aire,veamos que cae!\n");
        if(rnd.nextInt(2) == 0){
            System.out.println("Es cara");
        }else{
            System.out.println("Es cruz");
        }


    }

}
