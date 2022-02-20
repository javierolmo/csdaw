package csdaw.tema11.pClasesApoyo;

import java.util.Random;

class DadoFalso {

    public int lanzar(int n) {
        int result = new Random().nextInt(7) + 1;
        return result == 7? n : result;
    }

}
