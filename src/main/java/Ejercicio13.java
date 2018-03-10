import java.util.ArrayList;
import java.util.List;

public class Ejercicio13 {

    public static void main(String[] args) {
        Integer cntDos = 0;
        Integer cntTres = 0;

        List<Integer> mltpdos = new ArrayList<>();
        List<Integer> mltptres = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                mltpdos.add(i);

                cntDos++;

            } else if (i % 3 == 0) {

                mltptres.add(i);

                cntTres++;

            }

        }

        System.out.println("Del 1 al 100 hubo "+cntDos+" múltiplos de dos y son:\n");

        mltpdos.stream().forEach((Integer i)->{
            System.out.println(i);
        });

        System.out.println("Del 1 al 100 hubo "+cntTres+" múltiplos de tres y son:\n");

        mltptres.stream().forEach((Integer i)->{
            System.out.println(i);
        });


    }
}