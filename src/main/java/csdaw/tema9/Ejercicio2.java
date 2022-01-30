package csdaw.tema9;

import csdaw.tema8.Figura2D_v8;
import csdaw.tema8.Rectangulo_v8;
import csdaw.tema8.Triangulo_v8;

import java.util.Scanner;

public class Ejercicio2 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Figura2D_v8 figura2D_v8;

        System.out.println("Selecciona el tipo de figura.");
        System.out.print("Triángulo (1) o rectángulo (2)?: ");
        int eleccion = scanner.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Creando triángulo...");
                System.out.print("Introduce estilo: ");
                String estilo = scanner.next();
                System.out.print("Introduce alto: ");
                int alto = scanner.nextInt();
                System.out.print("Introduce ancho: ");
                int ancho = scanner.nextInt();
                System.out.print("Introduce nombre: ");
                String nombre = scanner.next();
                figura2D_v8 = new Triangulo_v8(estilo, alto, ancho, nombre);
                break;
            case 2:
                System.out.println("Creando rectángulo...");
                System.out.print("Introduce alto: ");
                int alto2 = scanner.nextInt();
                System.out.print("Introduce ancho: ");
                int ancho2 = scanner.nextInt();
                System.out.print("Introduce nombre: ");
                String nombre2 = scanner.next();
                figura2D_v8 = new Rectangulo_v8(alto2, ancho2, nombre2);
                break;
            default:
                System.out.println("Opción incorrecta.");
                return;
        }

        System.out.println("--------------------------");
        System.out.println("Clase: " + figura2D_v8.getClass().getSimpleName());
        figura2D_v8.verDim();
        if(figura2D_v8 instanceof Triangulo_v8) System.out.println("Área: " + ((Triangulo_v8)figura2D_v8).area());
        if(figura2D_v8 instanceof Rectangulo_v8) System.out.println("Es cuadrado?: " + ((Rectangulo_v8)figura2D_v8).esCuadrado());



    }
}
