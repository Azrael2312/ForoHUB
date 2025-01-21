# ForoHub - Alura Challenge

ForoHub is a backend API project developed using Spring Boot. The goal of this project is to create a RESTful API for managing forum topics, users, and related data. This project demonstrates the implementation of CRUD operations, database integration, and basic authentication/authorization functionalities.

---

## Features

1. **API for managing topics (CRUD):**
    - Create a new topic
    - View all topics
    - View a specific topic by ID
    - Update an existing topic
    - Delete a topic

2. **Database Integration:**
    - The project uses MySQL for data persistence.
    - Tables include `topico`, `usuario`, `curso`, and `respuesta`.

3. **Validation:**
    - Implements business rule validations for required fields and constraints.

4. **Security:**
    - Spring Security integration (currently configured to allow all requests for testing).
    - Optional enhancement: JWT-based authentication for production.

5. **Best Practices:**
    - Follow RESTful API standards.
    - Layered architecture: `controller`, `service`, `repository`, and `model`.

---

## Prerequisites

### Tools Required:
1. **Java 17+**
2. **MySQL 8.0+**
3. **Maven**
4. **Postman** (for testing endpoints)
5. **IntelliJ IDEA** (or any IDE for Java development)

### Installations:
1. Ensure you have MySQL installed and running.
2. Create a database named `forohub` in MySQL.
    ```sql
    CREATE DATABASE forohub;
    ```
3. Configure the `application.properties` file with your database credentials.

---

## Project Structure

```
foro-hub/
├── src/main/java/
│   └── com/forohub/
│       ├── config/         # Security and app configurations
│       ├── controller/     # Controllers for handling HTTP requests
│       ├── model/          # Entity classes for database
│       ├── repository/     # Data access layer (DAOs)
│       ├── service/        # Business logic layer
│       └── ForoHubApplication.java  # Main application class
├── src/main/resources/
│   ├── db/migration/       # Flyway migrations
│   ├── application.properties # App configurations
│   ├── static/             # Static files (optional)
│   └── templates/          # Templates for web views (if applicable)
├── pom.xml                 # Maven dependencies
└── README.md               # Project documentation
```

---

## Setup and Run

### Step 1: Clone the Repository
Clone the project from your version control system:
```bash
git clone <repository-url>
cd foro-hub
```

### Step 2: Configure the Application
Edit the `src/main/resources/application.properties` file to set up your database:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/forohub
spring.datasource.username=<your-mysql-username>
spring.datasource.password=<your-mysql-password>
spring.jpa.hibernate.ddl-auto=update
spring.flyway.enabled=true
```

### Step 3: Run Database Migrations
Ensure Flyway runs migrations to create the necessary tables.

### Step 4: Build and Run the Project
1. Build the project using Maven:
   ```bash
   mvn clean install
   ```
2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

The server will start at `http://localhost:8080`.

---

## API Endpoints

### Topics (`/api/topicos`):
| Method | Endpoint                  | Description              |
|--------|---------------------------|--------------------------|
| GET    | `/api/topicos`            | Get all topics           |
| GET    | `/api/topicos/{id}`       | Get topic by ID          |
| POST   | `/api/topicos`            | Create a new topic       |
| PUT    | `/api/topicos/{id}`       | Update an existing topic |
| DELETE | `/api/topicos/{id}`       | Delete a topic           |

---

## Testing

1. **Postman:**
    - Import the API requests into Postman and test endpoints.
    - Example request body for creating a topic:
      ```json
      {
          "titulo": "Nuevo Tópico",
          "mensaje": "Mensaje de ejemplo",
          "status": "ABIERTO",
          "autor": { "id": 1 },
          "curso": { "id": 1 }
      }
      ```

2. **Database Validation:**
    - Use MySQL to verify the data is being persisted:
      ```sql
      SELECT * FROM topico;
      ```

---

## Future Improvements

1. Implement authentication and authorization using JWT.
2. Add unit and integration tests.
3. Enhance API documentation using tools like Swagger.
4. Deploy the project to a cloud provider (e.g., AWS, Heroku).

---

## Contributors
- Andy Zárate

---

## License
This project is licensed under the MIT License. See `LICENSE` for details.

