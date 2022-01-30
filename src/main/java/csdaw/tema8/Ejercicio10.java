package csdaw.tema8;

public class Ejercicio10 {

    public static void main(String[] args) {
        MovilPrepago movilPrepago = new MovilPrepago(666666666, 0.15f, 0.5f, 0.20f, 50);
        MovilPlus movilPlus = new MovilPlus(777777777, 0.5f, 0.20f, 50);
        MovilTarifaPlana movilTarifaPlana = new MovilTarifaPlana(888888888, 0.15f, 0.5f, 50);

        System.out.println("Inicial: " + movilPrepago.toString());
        movilPrepago.efectuarLlamada(120);
        System.out.println("Después de llamada: " + movilPrepago.toString());
        movilPrepago.navegar(50);
        System.out.println("Después de navegar: " + movilPrepago.toString());
        System.out.println("--------------------------------------------");

        System.out.println("Inicial: " + movilPlus.toString());
        movilPlus.efectuarLlamada(120);
        System.out.println("Después de llamada: " + movilPlus.toString());
        movilPlus.navegar(50);
        System.out.println("Después de navegar: " + movilPlus.toString());
        movilPlus.videollamada(60);
        System.out.println("Después de videollamada: " + movilPlus.toString());
        System.out.println("--------------------------------------------");

        System.out.println("Inicial: " + movilTarifaPlana.toString());
        movilTarifaPlana.efectuarLlamada(120);
        System.out.println("Después de llamada: " + movilTarifaPlana.toString());
        movilTarifaPlana.navegar(50);
        System.out.println("Después de navegar: " + movilTarifaPlana.toString());
        System.out.println("--------------------------------------------");



    }
}
