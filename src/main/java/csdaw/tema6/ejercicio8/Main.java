package csdaw.tema6.ejercicio8;

public class Main {

    public static void main(String[] args) {

        // Creación de libros
        EjemplarLibro libro1 = new EjemplarLibro("Ejemplo libro 1");
        EjemplarLibro libro2 = new EjemplarLibro("Ejemplo libro 2");
        EjemplarLibro libro3 = new EjemplarLibro(libro1);
        EjemplarLibro libro4 = new EjemplarLibro("Ejemplo libro 4");

        // Préstamos y devoluciones
        libro1.prestar();
        libro2.prestar();
        libro2.devolver();

        // Sacar por pantalla
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());


    }

}
