package csdaw.tema10.ejercicio12;

public class MovilPlus_v2 extends MovilPrepago_v2 implements PrePagable {

    public MovilPlus_v2(long numeroMovil, float costeMinutoLlamada, float costeMB, float saldo) {
        super(numeroMovil, 0, costeMinutoLlamada, costeMB, saldo);
    }

    public void videollamada(int segundos) {
        navegar(2 * segundos);
    }


    @Override
    public String toString() {
        return "MovilPlus{" +
                "numeroMovil=" + numeroMovil +
                ",saldo=" + getSaldo() +
                '}';
    }
}
