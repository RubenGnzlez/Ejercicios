import java.util.Arrays;
import java.util.List;

public class Ejercicio33 {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ruben", "Elizabeth", "Rho", "Andree", "Eagis", "Nereida", "Esmeralda", "Fern",
                "Juan", "Benjamin", "Bufford", "Blue", "Rondamon", "Hernandez", "Valgamidadez", "Hermest", "Larry", "Elain",
                "Vladimir", "Sergio");


        nombres.stream().forEach((String s) -> {
            System.out.println(s);
        });


    }
}