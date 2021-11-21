package tema5;

public class Ejercicio11 {

    static float saldo = 500f;

    public static void main(String[] args) {

        ingresar(saldo, 600f);
        if (saldo > 1000f) {
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tienes más de 1000 euros: " + saldo);
        }
    }

    static void ingresar (float saldoAnterior, float incremento) {
        saldo += incremento;
    }

}
