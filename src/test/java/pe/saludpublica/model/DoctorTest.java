

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
}