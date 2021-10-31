package tema3;

public class Ejercicio21 {

    public static void main(String[] args) {

        int ant = 1;
        int ant2 = 0;
        int num = 0;

        for (int i=0; i<12; i++) {
            System.out.println(num);
            num = ant + ant2;
            ant = ant2;
            ant2 = num;
        }
    }

}
