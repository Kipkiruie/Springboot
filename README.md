# Spring Boot Project

This is a Spring Boot application demonstrating basic CRUD operations for a student management system. The application includes features such as creating, reading, updating, and deleting student records.

## Features

- **CRUD Operations**:
  - Create a new student.
  - Retrieve all students or a specific student by ID.
  - Update an existing student's details.
  - Delete a student.
- **Spring Boot Configuration**: Includes application properties and dependency management using Maven.
- **Layered Architecture**:
  - **Controller Layer**: Handles HTTP requests and responses.
  - **Service Layer**: Contains business logic.
  - **Repository Layer**: Interacts with the database.
- **Example Student Entity**: Demonstrates the use of JPA for object-relational mapping.

## Project Structure

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.demo
│   │   │       ├── DemoApplication.java
│   │   │       ├── student
│   │   │           ├── Student.java
│   │   │           ├── StudentController.java
│   │   │           ├── StudentService.java
│   │   │           ├── StudentRepository.java
│   │   │           ├── StudentConfig.java
│   │   ├── resources
│   │       ├── application.properties
│   └── test
│       └── java
│           └── com.example.demo
│               ├── DemoApplicationTests.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
```

## Prerequisites

1. **Java**: Ensure you have JDK 11 or higher installed.
2. **Maven**: Verify that Maven is installed and added to your PATH.
3. **Database**: This project is set up for H2 Database by default. Modify `application.properties` to configure other databases.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/Kipkiruie/Springboot.git
   cd Springboot
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the application:
   - API documentation (if using Swagger): `http://localhost:8080/swagger-ui.html`
   - Example endpoint: `http://localhost:8080/api/v1/students`

## Configuration

Modify the `src/main/resources/application.properties` file to customize the database connection, server port, and other settings.

Example:
```properties
# Server configuration
server.port=8080

# Database configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## Technologies Used

- **Spring Boot**: Framework for building Java-based web applications.
- **Spring Data JPA**: Simplifies data access layers.
- **H2 Database**: In-memory database for testing and development.
- **Maven**: Build and dependency management tool.

## License

This project is licensed under the MIT License. Feel free to use and modify it.

---

For any questions or feedback, feel free to contact [Elisha Ng'etich](https://github.com/Kipkiruie).
