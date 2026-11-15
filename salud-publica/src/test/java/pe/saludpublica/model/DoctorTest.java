package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    @DisplayName("Crear un doctor con datos válidos")
    void shouldCreateDoctorWithValidData() {
        Doctor doctor = new Doctor("11223344", "Carlos", "Ramírez", "CMP 085432", "ESP-001");

        assertNotNull(doctor);
        assertEquals("11223344", doctor.getDocumento());
        assertEquals("Carlos", doctor.getNombres());
        assertEquals("Ramírez", doctor.getApellidos());
        assertEquals("CMP 085432", doctor.getColegiatura());
        assertEquals("ESP-001", doctor.getEspecialidad());
    }
    @Test
    @DisplayName("Rechazar la creación de un doctor sin documento")
    void shouldRejectDoctorWithoutDocument() {
        assertThrows(IllegalArgumentException.class,
                () -> new Doctor(null, "Carlos", "Ramírez", "CMP 085432", "ESP-001"));
    }
    @Test
    @DisplayName("Rechazar la creación de un doctor sin nombres")
    void shouldRejectDoctorWithoutFirstName() {
        assertThrows(IllegalArgumentException.class,
                () -> new Doctor("11223344", null, "Ramírez", "CMP 085432", "ESP-001"));
    }
    @Test
    @DisplayName("Rechazar la creación de un doctor sin apellidos")
    void shouldRejectDoctorWithoutLastName() {
        assertThrows(IllegalArgumentException.class,
                () -> new Doctor("11223344", "Carlos", null, "CMP 085432", "ESP-001"));
    }
    @Test
    @DisplayName("Rechazar la creación de un doctor sin colegiatura")
    void shouldRejectDoctorWithoutLicense() {
        assertThrows(IllegalArgumentException.class,
                () -> new Doctor("11223344", "Carlos", "Ramírez", null, "ESP-001"));
    }
    @Test
    @DisplayName("Conservar cada atributo después de construir el objeto")
    void shouldKeepEachAttributeAfterConstruction() {
        Doctor doctor = new Doctor("55667788", "Marta", "Salazar", "CMP 123456", "ESP-002");

        assertEquals("55667788", doctor.getDocumento());
        assertEquals("Marta", doctor.getNombres());
        assertEquals("Salazar", doctor.getApellidos());
        assertEquals("CMP 123456", doctor.getColegiatura());
        assertEquals("ESP-002", doctor.getEspecialidad());
    }
}