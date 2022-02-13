package csdaw.tema10.ejercicio12;

public interface PrePagable {

    default float consultarSaldo() {
        return getSaldo();
    }

    default boolean recargar(int importe){
        if (importe % 5 == 0) {
            setSaldo(getSaldo() + importe);
            return true;
        } else {
            return false;
        }
    }

    void efectuarLlamada(int segundos);

    void navegar(int mb);

    float getSaldo();

    void setSaldo(float saldo);
}
