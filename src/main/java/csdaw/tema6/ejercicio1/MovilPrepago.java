package csdaw.tema6.ejercicio1;

public class MovilPrepago {

    private int numeroMovil;
    private float costeEstablecerLlamada;
    private float costeMinutoLlamada;
    private float costeConsumoMB;
    private float saldo;

    public MovilPrepago(int numeroMovil, float costeEstablecerLlamada, float costeMinutoLlamada, float costeConsumoMB, float saldo) {
        this.numeroMovil = numeroMovil;
        this.costeEstablecerLlamada = costeEstablecerLlamada;
        this.costeMinutoLlamada = costeMinutoLlamada;
        this.costeConsumoMB = costeConsumoMB;
        this.saldo = saldo;
    }

    /**
     * Consume saldo en función del coste de la llamada
     * @param segundos duración de la llamada
     */
    public void efectuarLlamada(int segundos) {
        saldo -= costeEstablecerLlamada;
        saldo -= (segundos/60 + 1) * costeMinutoLlamada;
    }

    /**
     * Consume saldo en función del coste del mb
     * @param mb
     */
    public void navegar(int mb) {
        saldo -= mb * costeConsumoMB;
    }

    /**
     * Aumenta el saldo, debe ser un múltiplo de 5 euros, sino devuelve false
     * @param importe
     * @return
     */
    public boolean recargar(int importe) {
        if (importe % 5 == 0 && importe > 0) {
            saldo += importe;
            System.out.println("Se ha hecho una recarga de " + importe + "€");
            return true;
        } else {
            System.out.println("El importe del saldo debe de ser múltiplo de 5");
            return false;
        }
    }

    /**
     * Consulta el saldo actual
     * @return
     */
    public float consultarSaldo() {
        return saldo;
    }

}
