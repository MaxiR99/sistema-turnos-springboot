# Sistema de Turnos - Spring Boot

API REST para la gestión de pacientes, profesionales y turnos médicos.

## Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Postman

## Funcionalidades

- CRUD de Pacientes
- CRUD de Profesionales
- CRUD de Turnos
- Validación de horarios duplicados
- DTOs
- Manejo global de excepciones
- Validaciones con Bean Validation

## Endpoints

### Pacientes
GET /pacientes
POST /pacientes
PUT /pacientes/{id}
DELETE /pacientes/{id}

### Profesionales
GET /profesionales
POST /profesionales
PUT /profesionales/{id}
DELETE /profesionales/{id}

### Turnos
GET /turnos
POST /turnos
PUT /turnos/{id}
DELETE /turnos/{id}

GET /turnos/profesional/{id}
GET /turnos/paciente/{id}
