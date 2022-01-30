package csdaw.tema7.bloqueB;

public class Primitiva2 {

    /*public static int NUMEROS_BOLETO = 6;
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
    }*/

}
