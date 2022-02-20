package csdaw.tema11.pClasesApoyo;

import java.util.Random;

public class Dado {

    public static int lanzar() {
        return new Random().nextInt(6)+1;
    }
}
