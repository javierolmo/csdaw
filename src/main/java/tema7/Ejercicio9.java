package tema7;

import java.util.Arrays;

public class Ejercicio9 {



    public static void main(String[] args) {
        int[] edades = {18, 12, 41, 62, 23, 51, 24, 57, 27, 47, 52, 9, 7};

        double media = calcularMedia(edades);
        System.out.println("Media edades: " + media);

        int[] mayores = filtrarMayoresDeEdad(edades);
        System.out.println("Mayores de edad: " + Arrays.toString(mayores));
    }

    public static double calcularMedia(int[] numeros) {
        int suma = 0;
        for(int i=0; i< numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public static int[] filtrarMayoresDeEdad(int[] edades) {
        int contador = 0;
        for(int i=0; i<edades.length; i++) {
            if(edades[i] >= 18) contador++;
        }
        int[] result = new int[contador];

        int posicion = 0;
        for(int i=0; i<edades.length; i++) {
            if(edades[i] >= 18) {
                result[posicion] = edades[i];
                posicion++;
            }
        }
        return result;
    }

}
