package tema8;

public class Ejercicio2 {

    public static void main(String[] args) {
        Triangulo_v2 triangulo = new Triangulo_v2();

        triangulo.setAncho(10);
        triangulo.setAlto(5);
        triangulo.estilo = "isósceles";

        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }

}
