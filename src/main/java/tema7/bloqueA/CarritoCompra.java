package tema7.bloqueA;

public class CarritoCompra {

    private final int MAX_ARTICULOS = 100;

    private Producto[] contenido;
    private double total;

    public CarritoCompra() {
        total = 0;
        contenido = new Producto[MAX_ARTICULOS];
    }

    public Producto[] getContenido() {
        return contenido;
    }

    public String addProducto(Producto producto) {
        for(int i=0; i< contenido.length; i++) {
            if (contenido[i] == null) {
                contenido[i] = producto;
                total += producto.getPrecioTotal();
                return "Producto añadido correctamente";
            }
        }
        return "No hay más espacio en la cesta";
    }

    public double getTotal() {
        return total;
    }
}
