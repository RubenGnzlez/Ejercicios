import java.util.Random;

public class Ejercicio29 {

    public static void main(String[] args) {

        Random rdm = new Random();
        Integer counter = 0;


        for (int i = 0; i < 100; i++) {

            Integer dado1 = 0;
            Integer dado2 = 0;

            while(dado1==0){
                dado1 = rdm.nextInt(7);
            }
            while(dado2==0){
                dado2 = rdm.nextInt(7);
            }

            if(dado1 + dado2 == 10){
                counter++;
            }

        }

        System.out.println("Un total de "+ counter+" veces los dados sumaron 10");



    }

}
