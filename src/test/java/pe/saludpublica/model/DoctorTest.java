package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    @Test
    @DisplayName("Crear un doctor con datos válidos")
    void shouldCreateDoctorWithValidData() {
        Doctor doctor = new Doctor("73123456", "Ana", "Lopez", "CMP12345", "Cardiologia");

        assertEquals("73123456", doctor.getDocumento());
        assertEquals("CMP12345", doctor.getColegiatura());
        assertEquals("Ana", doctor.getNombres());
        assertEquals("Lopez", doctor.getApellidos());
        assertEquals("Cardiologia", doctor.getEspecialidad());
    }

    @Test
    @DisplayName("Rechazar la creación de un doctor sin documento")
    void shouldRejectDoctorWithoutDocument() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Doctor(null, "Ana", "Lopez", "CMP12345", "Cardiologia");
        });
    }

    @Test
    @DisplayName("Rechazar la creación de un doctor sin colegiatura")
    void shouldRejectDoctorWithoutLicense() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("73123456", "Ana", "Lopez", null, "Cardiologia");
        });
    }

    @Test
    @DisplayName("Rechazar la creación de un doctor sin nombres")
    void shouldRejectDoctorWithoutNames() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("73123456", null, "Lopez", "CMP12345", "Cardiologia");
        });
    }

    @Test
    @DisplayName("Rechazar la creación de un doctor sin apellidos")
    void shouldRejectDoctorWithoutLastNames() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("73123456", "Ana", null, "CMP12345", "Cardiologia");
        });
    }
}