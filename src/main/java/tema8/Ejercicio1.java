package tema8;

public class Ejercicio1 {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();

        triangulo.ancho = 10;
        triangulo.alto = 5;
        triangulo.estilo = "isósceles";

        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }


}



