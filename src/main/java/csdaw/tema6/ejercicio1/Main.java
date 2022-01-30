package csdaw.tema6.ejercicio1;

public class Main {

    public static void main(String[] args) {

        MovilPrepago movilPrepago = new MovilPrepago(1234567890, 0.15f, 0.05f, 0.10f, 0);

        movilPrepago.recargar(10);
        System.out.println("Saldo: " + movilPrepago.consultarSaldo());
        movilPrepago.efectuarLlamada(30);
        System.out.println("Saldo: " + movilPrepago.consultarSaldo());
        movilPrepago.navegar(10);
        System.out.println("Saldo: " + movilPrepago.consultarSaldo());

    }
}
