

package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    @DisplayName("Debe crear un doctor correctamente")
    void shouldCreateDoctorSuccessfully() {
        Doctor doctor = new Doctor(
                "12345678",
                "Juan",
                "Perez",
                "CMP12345",
                "CARDIOLOGIA"
        );

        assertNotNull(doctor);
    }

    @Test
    @DisplayName("No debe permitir documento nulo")
    void shouldThrowExceptionWhenDocumentIsNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor(null, "Juan", "Perez",
                        "CMP12345", "CARDIOLOGIA")
        );
    }

    @Test
    @DisplayName("No debe permitir apellidos nulos")
    void shouldThrowExceptionWhenSurnamesAreNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("12345678", "Juan", "pedro",
                        "CMP12345", "CARDIOLOGIA")
        );
    }
}
