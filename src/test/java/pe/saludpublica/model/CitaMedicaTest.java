package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CitaMedicaTest {

    @Test
    @DisplayName("Crear cita médica con datos válidos")
    void shouldCreateAppointmentWithValidData() {
        Paciente paciente = new Paciente("73123456", "Juan", "Perez", "987654321", "juan@test.com");
        Doctor doctor = new Doctor("12345678", "Ana", "Lopez", "CMP12345", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2026, 12, 1, 10, 30);

        CitaMedica cita = new CitaMedica(paciente, doctor, fechaHora);

        assertEquals(paciente, cita.getPaciente());
        assertEquals(doctor, cita.getDoctor());
        assertEquals(fechaHora, cita.getFechaHora());
    }

    @Test
    @DisplayName("Rechazar la creación de una cita sin identificador de paciente")
    void shouldRejectAppointmentWithoutPatient() {
        Doctor doctor = new Doctor("12345678", "Ana", "Lopez", "CMP12345", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2026, 12, 1, 10, 30);

        assertThrows(IllegalArgumentException.class, () -> {
            new CitaMedica(null, doctor, fechaHora);
        });
    }

    @Test
    @DisplayName("Rechazar la creación de una cita sin identificador de doctor")
    void shouldRejectAppointmentWithoutDoctor() {
        Paciente paciente = new Paciente("73123456", "Juan", "Perez", "987654321", "juan@test.com");
        LocalDateTime fechaHora = LocalDateTime.of(2026, 12, 1, 10, 30);

        assertThrows(IllegalArgumentException.class, () -> {
            new CitaMedica(paciente, null, fechaHora);
        });
    }

    @Test
    @DisplayName("Rechazar la creación de una cita sin fecha y hora")
    void shouldRejectAppointmentWithoutDate() {
        Paciente paciente = new Paciente("73123456", "Juan", "Perez", "987654321", "juan@test.com");
        Doctor doctor = new Doctor("12345678", "Ana", "Lopez", "CMP12345", "Cardiología");

        assertThrows(IllegalArgumentException.class, () -> {
            new CitaMedica(paciente, doctor, null);
        });
    }

    @Test
    @DisplayName("Asignar estado PROGRAMADA por defecto al crear la cita")
    void shouldSetProgrammedStatusByDefault() {
        Paciente paciente = new Paciente("73123456", "Juan", "Perez", "987654321", "juan@test.com");
        Doctor doctor = new Doctor("12345678", "Ana", "Lopez", "CMP12345", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2026, 12, 1, 10, 30);

        CitaMedica cita = new CitaMedica(paciente, doctor, fechaHora);

        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());
    }
}