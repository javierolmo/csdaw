package csdaw.tema3;


import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Datos del más joven de la empresa
        int edadMasJoven = 99;
        char sexoMasJoven = '?';

        // Datos para calcular media edad mujeres
        int cantidadMujeres = 0;
        int sumaEdadMujeres = 0;

        // Contador personas mayores de 60
        int personasMayores60 = 0;

        for (int i=1; i<=30; i++) {

            // Lectura edad
            System.out.println("Empleado nº"+i);
            System.out.print("Introduce edad (16-70): ");
            int edad = scanner.nextInt();

            // Validación edad
            if (edad == 0) {
                System.out.println("Se ha cancelado la ejecucion");
                break;
            } else if (edad < 16 || edad > 70) {
                System.out.println("Edad no válida. Debe estar entre 16-70");
                i--;
                continue;
            }

            // Lectura sexo
            System.out.print("Introduce sexo (H/M): ");
            char sexo = scanner.next().charAt(0);
            System.out.println("");

            // Validación sexo
             if(sexo != 'H' && sexo != 'M') {
                System.out.println("Sexo no válido. Debe ser H o M");
                i--;
                continue;
            }

            // Comprobar si el usuario introducido es el más joven hasta el momento
            if (edad < edadMasJoven) {
                edadMasJoven = edad;
                sexoMasJoven = sexo;
            }

            // Si es mujer, guardar los datos necesarios para luego hacer la media
            if (sexo == 'M') {
                cantidadMujeres++;
                sumaEdadMujeres += edad;
            }

            // Si es mayor de 60 años, incrementar el contador de personas mayores de 60
            if (edad > 60) {
                personasMayores60++;
            }

        }

        // Resumen
        System.out.println("--------------------------------------------------");
        System.out.println("Persona más joven: sexo -> " + sexoMasJoven + " | edad -> " + edadMasJoven);
        System.out.println("Media edad mujeres: " + (sumaEdadMujeres / cantidadMujeres));
        System.out.println("Cantidad personas >60: " + personasMayores60);

    }

}
