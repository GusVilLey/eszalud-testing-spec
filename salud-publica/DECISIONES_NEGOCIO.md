# Decisiones de negocio – Capa Model de EsZalud

- **Estudiante:** Neyra Jurado, Benjamin Israel
- **Código de matrícula:** i202330660
- **Rama:** tdd/NeyraJurado_Benjamin

Estas decisiones cubren las reglas que la EFP no define expresamente (sección 8).

## Decisiones tomadas

| Elemento | Decisión | Justificación |
| --- | --- | --- |
| Identificadores (paciente, doctor y especialidad de la cita; especialidad del doctor) | Se representan con `String`. | La EFP no fija el tipo; son referencias a otros registros. |
| Fecha y hora de la cita | Se usa `LocalDateTime`. | Es el tipo estándar de Java para fecha y hora. La conversión desde y hacia el texto de la base de datos corresponde a otra capa. |
| Estado de la cita | Se usa el `enum EstadoCita` con `PROGRAMADA`, `ATENDIDA` y `CANCELADA`. | Lo recomienda la EFP. |
| Estado `null` (CIT-006) | Se rechaza con `IllegalArgumentException`. | La EFP indica que no está establecido asignar `PROGRAMADA` automáticamente, por lo que no se inventa un valor por defecto. |
| Fechas pasadas | Se permiten. | La base de datos de ejemplo contiene una cita `ATENDIDA` con fecha ya vencida. |
| Motivo de la cita | Es opcional y no tiene validación. | No hay una regla de negocio que lo exija. |
| Formato y longitud de documento, teléfono, correo y colegiatura | No se imponen restricciones. | La EFP prohíbe inventarlas sin una regla de negocio que las justifique. |
| Descripción de la especialidad, teléfono y correo del paciente | Son opcionales. | No forman parte de las pruebas obligatorias. |

## Campos obligatorios (validados contra `null`)

- **Paciente:** documento, nombres y apellidos.
- **Doctor:** documento, nombres, apellidos y colegiatura.
- **Especialidad:** nombre.
- **CitaMedica:** paciente, doctor, especialidad, fecha y hora, y estado.

## Alcance

Se implementaron los 22 casos obligatorios (ESP-001 a 003, PAC-001 a 005, DOC-001 a 006 y CIT-001 a 008). Las pruebas adicionales recomendadas no se implementaron.

## Nota sobre el ciclo TDD

ESP-003, PAC-005, DOC-006, CIT-007 y CIT-008 pasaron al primer intento, porque el constructor implementado en un ciclo anterior ya cumplía ese comportamiento. Por eso no tienen fase RED.