package csdaw.tema8;

import java.util.Scanner;

public class Ejercicio9 {

    static Scanner teclado;

    public static void main(String[] args) {

        CuentaPlazo cuentaPlazo = new CuentaPlazo("565126561723");

        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion=pintarMenu ();
            switch (opcion) {
                case 1:
                    System.out.print("Cuánto quieres retirar? ");
                    float retirada = teclado.nextFloat();
                    cuentaPlazo.retirar(retirada);
                    break;
                case 2:
                    System.out.print("Cuánto quieres ingresar? ");
                    float ingreso = teclado.nextFloat();
                    cuentaPlazo.ingresar(ingreso);
                    break;
                case 3:
                    System.out.printf("El saldo de la cuenta es de %.2f", cuentaPlazo.getSaldo());
                    break;
                case 0: salir=true; break;
                default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu (){
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Retirar saldo");
        System.out.println("2 Ingresar saldo");
        System.out.println("3 Consultar saldo");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt (teclado.next());
        } catch (Exception e ) {return 999;}
    }

}
