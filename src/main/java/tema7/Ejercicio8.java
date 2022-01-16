package tema7;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CarritoCompra carritoCompra = new CarritoCompra();

        do {
            System.out.println("--------------------------------------");
            System.out.println("Menú:");
            System.out.println("1. Mostrar contenido del carrito");
            System.out.println("2. Añadir producto");
            System.out.println("3. Mostrar total");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if(carritoCompra.getContenido()[0] == null) {
                        System.out.println("Carrito vacío");
                    } else {
                        System.out.println("El contenido del carrito es el siguiente: ");
                        for(Producto producto : carritoCompra.getContenido()) {
                            if(producto == null) break;
                            System.out.println(producto.toString());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Introduce código: ");
                    String codigo = scanner.next();
                    System.out.print("Introduce descripción: ");
                    String descripcion = scanner.next();
                    System.out.print("Introduce cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Introduce precio: ");
                    double precio = scanner.nextDouble();
                    Producto producto = new Producto(codigo, descripcion, precio, cantidad);
                    carritoCompra.addProducto(producto);
                    break;
                case 3:
                    System.out.println("Total: " + carritoCompra.getTotal());
                    break;
                case 4: return;
            }
        } while (true);



    }

}
