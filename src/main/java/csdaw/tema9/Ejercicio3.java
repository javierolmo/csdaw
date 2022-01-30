package csdaw.tema9;

import csdaw.tema8.Figura2D_v8;
import csdaw.tema8.Rectangulo_v8;
import csdaw.tema8.TrianColor_v8;
import csdaw.tema8.Triangulo_v8;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figura2D_v8 figura2D_v8;

        System.out.println("Selecciona el tipo de figura.");
        System.out.print("Triángulo (1), rectángulo (2) o triancolor(3)?: ");
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
            case 3:
                System.out.println("Creando triancolor...");
                System.out.print("Introduce estilo: ");
                String estilo3 = scanner.next();
                System.out.print("Introduce alto: ");
                int alto3 = scanner.nextInt();
                System.out.print("Introduce ancho: ");
                int ancho3 = scanner.nextInt();
                System.out.print("Introduce nombre: ");
                String nombre3 = scanner.next();
                System.out.print("Introduce color: ");
                String color3 = scanner.next();
                figura2D_v8 = new TrianColor_v8(alto3, ancho3, estilo3, color3, nombre3);
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
        if(figura2D_v8 instanceof TrianColor_v8) System.out.println("Color: " + ((TrianColor_v8)figura2D_v8).getColor()); // Ojo Jose, el método getColor() no existía, habría que crearlo
    }

}
