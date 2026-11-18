package pe.saludpublica.model;

/**
 * Cita médica programada entre un paciente y un doctor.
 */
public class CitaMedica {

    private final String paciente;
    private final String doctor;
    private final String especialidad;
    private final String fechaHora;
    private final String motivo;
    private final EstadoCita estado;

    public CitaMedica(String paciente, String doctor, String especialidad,
                      String fechaHora, String motivo, EstadoCita estado) {
        this.paciente = requerido(paciente, "El identificador del paciente es obligatorio");
        this.doctor = requerido(doctor, "El identificador del doctor es obligatorio");
        this.especialidad = requerido(especialidad, "El identificador de la especialidad es obligatorio");
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = estado == null ? EstadoCita.PROGRAMADA : estado;
    }

    private static String requerido(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
        return valor;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }
}
