package tema6.ejercicio9;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class ApartadoH {

    public static void main(String[] args) {

        int anoActual = LocalDate.now().getYear();

        for(int i = anoActual-4; i <= anoActual; i++) {
            LocalDate diciembre31 = LocalDate.of(i, 12, 31);
            String nombreDiaIngles = diciembre31.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            String nombreDiaGallego = traducirDiaGallego(nombreDiaIngles);
            System.out.printf("31/12/%d: %s\n", i, nombreDiaGallego);
        }

    }

    public static String traducirDiaGallego(String diaIngles) {
        switch (diaIngles) {
            case "Monday": return "Luns";
            case "Tuesday": return "Martes";
            case "Wednesday": return "Mércores";
            case "Thursday": return "Xoves";
            case "Friday": return "Venres";
            case "Saturday": return "Sábado";
            case "Sunday": return "Domingo";
            default: return "Día incorrecto: " + diaIngles;
        }
    }
}
