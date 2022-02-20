package csdaw.tema11;

import static csdaw.tema11.pClasesApoyo.Dado.lanzar;
import static java.lang.Math.PI;

public class Ejercicio4 {

    public static void main(String[] args) {
        int numeroDado = lanzar();
        System.out.println("Resultado dado: " + numeroDado);
        double areaCirculo = numeroDado * numeroDado * PI;
        System.out.println("Área del círculo de radio " + numeroDado + ": " + areaCirculo);
    }

}
