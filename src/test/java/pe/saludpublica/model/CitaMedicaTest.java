package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CitaMedicaTest {

    @Test
    @DisplayName("Crear una cita médica con datos válidos")
    void shouldCreateAppointmentWithValidData() {
        CitaMedica cita = new CitaMedica(
                "6af71e0b501cca046a166049",
                "6af7271e501cca046a16604f",
                "6af71da3501cca046a166045",
                "2026-11-23 16:30",
                "Dolor abdominal",
                EstadoCita.PROGRAMADA
        );

        assertNotNull(cita);
        assertEquals("6af71e0b501cca046a166049", cita.getPaciente());
        assertEquals("6af7271e501cca046a16604f", cita.getDoctor());
        assertEquals("6af71da3501cca046a166045", cita.getEspecialidad());
        assertEquals("2026-11-23 16:30", cita.getFechaHora());
        assertEquals("Dolor abdominal", cita.getMotivo());
        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());
    }

    @Test
    @DisplayName("Verificar los atributos después de construir la cita médica")
    void shouldExposeAllAttributesAfterCreation() {
        CitaMedica cita = new CitaMedica(
                "6af71f6a501cca046a16604b",
                "6af7301390f1d08b4673bfa5",
                "6af71da3501cca046a166048",
                "2026-11-26 10:05",
                "Acné excesivo",
                EstadoCita.ATENDIDA
        );

        assertAll(
                () -> assertEquals("6af71f6a501cca046a16604b", cita.getPaciente()),
                () -> assertEquals("6af7301390f1d08b4673bfa5", cita.getDoctor()),
                () -> assertEquals("6af71da3501cca046a166048", cita.getEspecialidad()),
                () -> assertEquals("2026-11-26 10:05", cita.getFechaHora()),
                () -> assertEquals("Acné excesivo", cita.getMotivo()),
                () -> assertEquals(EstadoCita.ATENDIDA, cita.getEstado())
        );
    }
}
