package csdaw.tema8;

import java.time.LocalDate;

public final class CuentaPlazo extends CuentaCorriente {

    private LocalDate fechaCreacion;

    public CuentaPlazo(String iban) {
        super(iban);
        setComision(0, 0);
        this.fechaCreacion = LocalDate.now();
    }

    @Override
    public boolean retirar(float importe) {
        if (importe <= getSaldo()) {
            setSaldo(getSaldo() - importe);  //resta (importe+comision)
            setContadorIngresos(0);
            return true;
        } else return false;
    }
}
