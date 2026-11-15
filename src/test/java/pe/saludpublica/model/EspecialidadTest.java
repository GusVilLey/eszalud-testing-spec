

package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EspecialidadTest {

    @Test
    @DisplayName("Debe crear una especialidad correctamente")
    void shouldCreateSpecialtySuccessfully() {
        Especialidad especialidad = new Especialidad(
                "Cardiologia",
                "Especialidad médica del corazón"
        );

        assertNotNull(especialidad);
    }

}