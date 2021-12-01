package tema6.ejercicio7;

public class Main {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(3);

        double circunferencia1 = circulo1.calcularCircunferencia();
        double circunferencia2 = circulo2.calcularCircunferencia();

        double superficie1 = circulo1.calcularSuperficie();
        double superficie2 = circulo2.calcularSuperficie();

        double diametro1 = circulo1.calcularDiametro();
        double diametro2 = circulo2.calcularDiametro();

        System.out.println("Círculo 1:");
        System.out.println("circunferencia -> " + circunferencia1);
        System.out.println("superficie -> " + superficie1);
        System.out.println("diametro -> " + diametro1);
        System.out.println();
        System.out.println("Círculo 2:");
        System.out.println("circunferencia -> " + circunferencia2);
        System.out.println("superficie -> " + superficie2);
        System.out.println("diametro -> " + diametro2);
    }
}
