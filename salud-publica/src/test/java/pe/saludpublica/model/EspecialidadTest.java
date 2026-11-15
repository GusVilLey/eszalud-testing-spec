package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EspecialidadTest {

    @Test
    @DisplayName("Crear una especialidad con datos válidos")
    void shouldCreateSpecialtyWithValidData() {
        Especialidad especialidad = new Especialidad("Pediatría", "Atención de niños y adolescentes");

        assertNotNull(especialidad);
        assertEquals("Pediatría", especialidad.getNombre());
        assertEquals("Atención de niños y adolescentes", especialidad.getDescripcion());
    }
}