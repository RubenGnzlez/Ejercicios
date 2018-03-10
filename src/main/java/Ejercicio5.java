public class Ejercicio5 {
    public static void main(String[] args){
        Integer contador = 0;
        System.out.println("Los numeros impares del 1 al 100 son:\n ");
        for( int i = 0; i<=100; i++){
            if(i % 2 !=0){
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Hay un total de "+contador+" numeros impares");

    }
}
