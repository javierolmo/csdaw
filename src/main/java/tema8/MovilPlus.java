package tema8;

public class MovilPlus extends MovilPrepago {

    MovilPlus(long numeroMovil, float costeMinutoLlamada, float costeMB, float saldo) {
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
