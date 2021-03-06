package csdaw.tema7.bloqueA;

import java.util.Random;

public class Primitiva {

    public static int NUMEROS_BOLETO = 6;
    private int[] resultado;
    private int desde = 1;
    private int hasta = 49;

    public Primitiva() {
        resultado = boletoAleatorio();
    }

    public int[] getResultado() {
        return resultado;
    }

    private int numeroAleatorioSinRepetidos(int[] existentes) {
        int aleatorio = new Random().nextInt(hasta + 1 - desde) + desde;
        boolean repetido = existeEnArray(existentes, aleatorio);
        if (repetido) {
            return numeroAleatorioSinRepetidos(existentes);
        } else {
            return aleatorio;
        }
    }

    private boolean existeEnArray(int[] existentes, int numero) {
        for (int existente : existentes) {
            if(existente == numero) return true;
        }
        return false;
    }

    public int comprobarAciertos(int[] boleto) {
        int aciertos = 0;
        for(int i=0; i<boleto.length; i++) {
            for(int j=0; j< resultado.length; j++) {
                if(boleto[i] == resultado[j]) aciertos++;
            }
        }
        return aciertos;
    }

    public int[] boletoAleatorio() {
        int[] boleto = new int[NUMEROS_BOLETO];
        for (int i=0; i<boleto.length; i++) {
            boleto[i] = numeroAleatorioSinRepetidos(boleto);
        }
        return boleto;
    }


}
