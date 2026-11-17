package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PacienteTest {

    @Test
    @DisplayName("Crear un paciente con datos válidos")
    void shouldCreatePatientWithValidData() {
        Paciente paciente = new Paciente(
                "12345678",
                "Ana",
                "Pérez",
                "987654321",
                "ana@mail.com"
        );

        assertNotNull(paciente);
        assertEquals("12345678", paciente.getDocumento());
        assertEquals("Ana", paciente.getNombres());
        assertEquals("Pérez", paciente.getApellidos());
        assertEquals("987654321", paciente.getTelefono());
        assertEquals("ana@mail.com", paciente.getCorreo());
    }

    @Test
    @DisplayName("Verificar los atributos después de construir el paciente")
    void shouldExposeAllAttributesAfterCreation() {
        Paciente paciente = new Paciente(
                "87654321",
                "Luis Alberto",
                "Ramírez Torres",
                "912345678",
                "luis.ramirez@mail.com"
        );

        assertAll(
                () -> assertEquals("87654321", paciente.getDocumento()),
                () -> assertEquals("Luis Alberto", paciente.getNombres()),
                () -> assertEquals("Ramírez Torres", paciente.getApellidos()),
                () -> assertEquals("912345678", paciente.getTelefono()),
                () -> assertEquals("luis.ramirez@mail.com", paciente.getCorreo())
        );
    }
}
