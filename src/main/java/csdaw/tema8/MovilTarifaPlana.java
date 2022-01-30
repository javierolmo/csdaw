package csdaw.tema8;

public class MovilTarifaPlana extends MovilPrepago {


    public MovilTarifaPlana(long numeroMovil, float costeEstablecimientoLlamada, float costeMinutoLlamada, float saldo) {
        super(numeroMovil, costeEstablecimientoLlamada, costeMinutoLlamada, 0, saldo);
    }

    @Override
    public void navegar(int mb) {

    }

    @Override
    public String toString() {
        return "MovilTarifaPlana{" +
                "numeroMovil=" + numeroMovil +
                ",saldo=" + getSaldo() +
                '}';
    }

}
