/*Hacer un programa con un menú que permita gestionar la cola de espera de un médico
con 3 tipos de pacientes : consulta(nombre, fecha nacimiento, motivo), receta(nomb., fecha nc., medicamentos) 
y revisión (nomb., fecha nc., fecha última visita)
Tarifas: consulta:100 eur. recetas:5 eur. revisión:30eur para mayores de 65 años, 50 eur para el resto.
Crear una clase para cada tipo de paciente en el propio archivo del programa con los constructores necesarios
y el método facturar() en cada una de las clases. Implementar herencia si es necesario.
Programa con menú para: registrar llegada del paciente (xq viene y su datos)
Llamar a consulta( por orden de llegada). Se cobra la tarifa correspondiente.
Consultar total facturado hasta ese momento.
autor: jose luis mosquera losada
fecha: 2-02-2022 */

package csdaw.tema10.ejercicio4;

import csdaw.tema9.ejercicio9.Paciente;
import csdaw.tema9.ejercicio9.PacienteConsulta;
import csdaw.tema9.ejercicio9.PacienteReceta;
import csdaw.tema9.ejercicio9.PacienteRevision;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

    
    public static List<Paciente> pacientes = new ArrayList<>();
    public static double facturacion = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        int opcion;
        do {
            opcion=pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("De qué tipo de paciente se trata? Opciones:");
                    System.out.println("1. Consulta");
                    System.out.println("2. Receta");
                    System.out.println("3. Revisión");
                    System.out.print("Introduce un número (1-3): ");
                    int tipoPaciente = scanner.nextInt();
                    pacientes.add(obtenerPaciente(tipoPaciente));
                    break;
                case 2:
                    if (pacientes.isEmpty()) {
                        System.out.println("No quedan pacientes!");
                    } else {
                        Paciente paciente = pacientes.get(0);
                        facturacion += paciente.facturar();
                        System.out.printf("Paciente atendido: %s (factura: %.2f)", paciente.getNombre(), paciente.facturar());
                        pacientes.remove(0);
                    }
                    break;
                case 3:
                    System.out.printf("La facturación hasta el momento es de: %f", facturacion);
                    break;
                case 0: salir=true; break;
                default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static Paciente obtenerPaciente(int tipoPaciente) {
        Paciente paciente = null;
        System.out.print("Introduce nombre del paciente: ");
        String nombre = scanner.next();
        System.out.print("Introduce fecha de nacimiento (yyyy/MM/dd):");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        switch (tipoPaciente) {
            case 1:
                paciente = new PacienteConsulta();
                paciente.setNombre(nombre);
                paciente.setFechaNacimiento(fechaNacimiento);
                System.out.print("Introduce motivo de consulta: ");
                String motivoConsulta = scanner.next();
                ((PacienteConsulta)paciente).setMotivoConsulta(motivoConsulta);
                break;
            case 2:
                paciente = new PacienteReceta();
                paciente.setNombre(nombre);
                paciente.setFechaNacimiento(fechaNacimiento);
                System.out.print("Introduce los medicamentos separados por comas: ");
                String medicamentos = scanner.next();
                ((PacienteReceta)paciente).setMedicamentos(Arrays.asList(medicamentos.split(",")));
                break;
            case 3:
                paciente = new PacienteRevision();
                paciente.setNombre(nombre);
                paciente.setFechaNacimiento(fechaNacimiento);
                System.out.print("Introduce fecha de última visita (yyyy/MM/dd):");
                LocalDate fechaUltimaVisita = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                ((PacienteRevision)paciente).setFechaUltimaVisita(fechaUltimaVisita);
                break;
        }
        System.out.println("Paciente creado con éxito");
        return paciente;
    }

    private static int pintarMenu (){
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Registrar paciente");
        System.out.println("2 Llamar a consulta");
        System.out.println("3 Consultar total facturado");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt (scanner.next());
        } catch (Exception e ) {return 999;}
    }

}
