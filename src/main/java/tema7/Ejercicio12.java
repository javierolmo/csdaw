package tema7;

public class Ejercicio12 {

    public static void main(String[] args) {
        double cateto1 = Double.parseDouble(args[0]);
        double cateto2 = Double.parseDouble(args[1]);

        if(cateto1 <= 0 || cateto2 <= 0) throw new IllegalArgumentException("Los catetos deben ser mayores que cero");
        double result = Math.sqrt(Math.pow(cateto1, 2) - Math.pow(cateto2, 2));

        System.out.println("Result = " + result);
    }
}
