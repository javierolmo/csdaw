package csdaw.tema7.bloqueB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Primitiva2 {

    public static int NUMEROS_BOLETO = 6;
    private ArrayList<Integer> resultado;
    private int desde = 1;
    private int hasta = 49;

    public Primitiva2() {
        resultado = boletoAleatorio();
    }

    public ArrayList<Integer> getResultado() {
        return resultado;
    }

    private int numeroAleatorioSinRepetidos(ArrayList<Integer> repetidos) {
        int result;
        boolean repetido = false;
        do {
            result = new Random().nextInt(hasta + 1 - desde) + desde;
            repetido = repetidos.contains(result);
        } while (repetido);
        return result;
    }

    public int comprobarAciertos(ArrayList<Integer> boleto) {

        int aciertos = 0;
        for (Integer numeroBoleto : boleto) {
            if(binarySearch(resultado, numeroBoleto)) aciertos++;
        }
        return aciertos;
    }

    private boolean binarySearch(ArrayList<Integer> arr, int x) {
        int left = 0, right = arr.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == x) return true;
            if (arr.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public ArrayList<Integer> boletoAleatorio() {
        ArrayList<Integer> boleto = new ArrayList<>();
        for (int i=0; i<NUMEROS_BOLETO; i++) {
            boleto.add( numeroAleatorioSinRepetidos(boleto));
        }
        Collections.sort(boleto);
        return boleto;
    }

}
