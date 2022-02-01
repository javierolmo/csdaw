package csdaw.tema9.ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta();
        bicicleta1.setMarca("Marca");
        bicicleta1.setModelo("Modelo");
        bicicleta1.setPrecio(100);

        Bicicleta bicicleta2 = new Bicicleta();
        bicicleta2.setMarca("Marca");
        bicicleta2.setModelo("Modelo");
        bicicleta2.setPrecio(100);
        bicicleta2.fijarDescuento(0.25, 3);

        System.out.println("Las bicicletas son iguales? " + bicicleta1.equals(bicicleta2)); // Deberían ser iguales, porque el ejercicio especifica que sólo se ha de comparar marca y modelo
        System.out.println("Precio final bici1: " + bicicleta1.precioConDescuento());
        System.out.println("Precio final bici2: " + bicicleta2.precioConDescuento());
    }

}
