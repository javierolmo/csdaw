package csdaw.tema9.ejercicio9;

public class PacienteConsulta extends Paciente {

    private String motivoConsulta;

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    @Override
    public double facturar() {
        return 100;
    }
}
