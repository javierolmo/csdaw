package tema8;

public class Ejercicio3 {

    public static void main(String[] args) {
        Triangulo_v3 triangulo = new Triangulo_v3("isosceles", 5, 10);

        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }

}
