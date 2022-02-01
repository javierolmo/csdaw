package csdaw.tema9.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class PacienteReceta extends Paciente {

    private List<String> medicamentos;

    public PacienteReceta() {
        this.medicamentos = new ArrayList<>();
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public double facturar() {
        return medicamentos.size() * 5;
    }
}
