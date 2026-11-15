


package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CitaMedicaTest {

    private final LocalDateTime fechaHora =
            LocalDateTime.of(2026, 11, 20, 10, 30);

    @Test
    @DisplayName("Debe crear una cita médica correctamente")
    void shouldCreateAppointmentSuccessfully() {
        CitaMedica cita = new CitaMedica(
                "PAC001",
                "DOC001",
                "ESP001",
                fechaHora,
                "Consulta general",
                EstadoCita.PROGRAMADA
        );

        assertNotNull(cita);
    }

    @Test
    @DisplayName("No debe permitir paciente nulo")
    void shouldThrowExceptionWhenPatientIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica(null, "DOC001", "ESP001",
                        fechaHora, "Consulta general", EstadoCita.PROGRAMADA)
        );
    }

    @Test
    @DisplayName("No debe permitir doctor nulo")
    void shouldThrowExceptionWhenDoctorIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica("PAC001", null, "ESP001",
                        fechaHora, "Consulta general", EstadoCita.PROGRAMADA)
        );
    }


    @Test
    @DisplayName("No debe permitir especialidad nula")
    void shouldThrowExceptionWhenSpecialtyIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica("PAC001", "DOC001", null,
                        fechaHora, "Consulta general", EstadoCita.PROGRAMADA)
        );
    }

    @Test
    @DisplayName("No debe permitir fecha y hora nulas")
    void shouldThrowExceptionWhenDateTimeIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica("PAC001", "DOC001", "ESP001",
                        null, "Consulta general", EstadoCita.PROGRAMADA)
        );
    }

    @Test
    @DisplayName("No debe permitir estado nulo")
    void shouldThrowExceptionWhenStatusIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new CitaMedica("PAC001", "DOC001", "ESP001",
                        fechaHora, "Consulta general", null)
        );
    }
}