# Módulo de Seguridad JWT para autenticación y autorización de usuarios

Este proyecto es una API REST desarrollada con Spring Boot que implementa autenticación y autorización usando JWT (JSON Web Token). Permite gestionar usuarios, y está preparado para integrarse fácilmente en aplicaciones que requieran seguridad basada en tokens.

## Características principales
- Registro y autenticación de usuarios
- Generación y validación de JWT
- Endpoints protegidos con Spring Security
- Persistencia con JPA y soporte para MySQL y H2

## Requisitos previos
- Java 17 o superior
- Maven 3.8+
- MySQL (opcional, para entorno de producción)

## Instalación y ejecución

1. **Clona el repositorio:**
   ```zsh
   git clone https://github.com/Drivasx/jwt-security-module.git
   cd jwt-security-module
   ```

2. **Configura la base de datos:**
   - Por defecto "Rama development", el proyecto usa H2 en memoria para desarrollo.
   - Para usar MySQL "Rama main"", edita `src/main/resources/application.properties` con tus credenciales:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/TASKSDB?serverTimezone=UTC
     spring.datasource.username=TU_USUARIO
     spring.datasource.password=TU_CONTRASEÑA
     ```

3. **Compila y ejecuta la aplicación:**
   ```zsh
   ./mvnw spring-boot:run
   ```
   O con Maven instalado:
   ```zsh
   mvn spring-boot:run
   ```

## Uso básico
- **Registro:** `POST /api/auth/signup`
- **Login:** `POST /api/auth/login` (devuelve JWT)
- **Endpoints protegidos:** Incluye el JWT en el apartado de autorización del cliente http de tu preferencia (Postman, Httpie, etc) `Authorization: Bearer <token>`

## Estructura del proyecto
```
src/main/java/com/davidrivas/todolist/
├── config/           # Configuración de seguridad y JWT
├── controller/       # Controladores REST
├── dto/              # Objetos de transferencia de datos
├── entity/           # Entidades JPA
├── repository/       # Repositorios JPA
├── service/          # Lógica de negocio y JWT
└── TodoListApplication.java # Clase principal
```


## Contribuir
1. Haz un fork del repositorio.
2. Crea una rama para tu feature/fix: `git checkout -b feature/nueva-funcionalidad`
3. Realiza tus cambios y haz commit.
4. Envía un pull request explicando tu aporte.

## Buenas prácticas
- Sigue la estructura de paquetes propuesta.
- Escribe pruebas para nuevas funcionalidades.
- Documenta tus endpoints y servicios.

## Licencia
Este proyecto está bajo la licencia MIT. Puedes usarlo y modificarlo libremente.

## Contacto
Para dudas o sugerencias, abre un issue o contacta a [David Rivas](davidmrivasb2004@gmail.com).

