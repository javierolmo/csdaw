package tema5;

public class Ejercicio7 {

    public static void main(String[] args) {
        int sumaPrimos = 0;
        for (int i=1; i<=1000; i++) {
            if(esPrimo(i)) {
                sumaPrimos += i;
            }
        }
        System.out.println("La suma de los números primos entre 1-1000 es: " + sumaPrimos);
    }

    public static boolean esPrimo(int numero) {
        if(Ejercicio6.cantidadDivisores(numero) == 2) {
//            System.out.println("El número " + numero + " es primo");
            return true;
        } else {
            return false;
        }
    }

}
