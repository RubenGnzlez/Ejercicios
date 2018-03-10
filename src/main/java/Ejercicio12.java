public class Ejercicio12 {

    public static void main(String[] args){

        Integer sumaPar = 0;

        Integer sumaImpar = 0;

        System.out.println("Numeros del 1 al 100:\n");

        for(int i =0; i<=100; i++){
            System.out.println(i);
            if( i % 2 == 0){

                sumaPar = sumaPar + i;

            }
            else{

                sumaImpar = sumaImpar + i;

            }

        }

        System.out.println("La suma de los pares es:\n"+ sumaPar+"\nLa suma de los impares es:\n"+sumaImpar);

    }

}
