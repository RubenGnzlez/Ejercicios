public class Ejercicio21 {

    public static void main(String[] args){

        Integer pares = 0;
        Integer impares = 0;

        for (int i = 0; i <= 1000; i++) {
            switch(i%2){
                case 0: pares+=i;
                    break;
                default: impares +=i;

            }
        }

        System.out.println("La suma de los pares del 1 al 1000 es: "+ pares);
        System.out.println("La suma de los impares del 1 al 1000 es:"+impares);

    }

}
