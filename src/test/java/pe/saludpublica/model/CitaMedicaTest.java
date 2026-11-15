


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
}
