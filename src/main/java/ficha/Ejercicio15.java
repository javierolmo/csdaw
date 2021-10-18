package ficha;

/*
    Haz 3 versiones de un mismo programa que pida que se introduzcan por teclado 2 números int sobre sendas variables
    llamadas 'a' y 'b' y que incluyan las instrucciones que se muestran abajo.
    Para cada una de las versiones, ejecútalo varias veces introduciendo cero para alguno de los valores y finalmente
    explica la diferencia de comportamiento entre cada una de las versiones
*/

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leer a
        System.out.print("Introduce a: ");
        int a = scanner.nextInt();

        // Leer b
        System.out.print("Introduce b: ");
        int b = scanner.nextInt();

        // Comparar resultados
        versionA(a, b);
        versionB(a, b);
        versionC(a, b);

    }

    private static void versionA(int a, int b) { // Utilizando el operador en cortocircuito, nunca dará error porque si 'b' fuera 0, la siguiente condición no se evaluaría
        if(b != 0 && a/b == 0) { int r = a/b; System.out.println("Version A: " + r); }
    }

    private static void versionB(int a, int b) { // En este caso sí podría fallar porque primero se hace la división. si 'b' fuera 0 la primera condición fallaría y la segunda nunca se ejecutaría
        if(a/b == 0 && b != 0) { int r = a/b; System.out.println("Version B: " + r); }
    }

    private static void versionC(int a, int b) { // Al usar el operador simple, siempre se van a intentar evaluar ambas condiciones, por lo que aunque primero se compruebe que 'b' != 0, luego se haría la división igualmente
        if(b != 0 & a/b == 0) { int r = a/b; System.out.println("Version C: " + r); }
    }
}
