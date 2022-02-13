package csdaw.tema10.ejercicio12;

public class MovilTarifaPlana_v2 extends MovilPrepago_v2  implements PrePagable {


    public MovilTarifaPlana_v2(long numeroMovil, float costeEstablecimientoLlamada, float costeMinutoLlamada, float saldo) {
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
