🏋️ Fitness Monolith – Java Backend Application

A monolithic fitness management backend application developed using Java and Spring Boot, designed to handle users, workouts, and fitness-related data through clean and scalable REST APIs.

🚀 Features

User and fitness data management

Workout and exercise tracking APIs

RESTful backend architecture

Centralized exception handling

Clean layered design for maintainability

🛠 Tech Stack

Java

Spring Boot, Spring MVC

Spring Data JPA, Hibernate

MySQL

Maven

Postman

Git & GitHub

🧱 Architecture Overview

The application follows a layered monolithic architecture:

Controller Layer  → API request handling
Service Layer     → Business logic
Repository Layer  → Database interaction
Entity Layer      → Domain models


This approach ensures separation of concerns and easier scalability.

📌 API Endpoints (Sample)
Method	Endpoint	Description
GET	/api/users	Fetch all users
POST	/api/users	Create new user
GET	/api/workouts	Get workouts
POST	/api/workouts	Add workout
⚙️ Run Locally
Prerequisites

Java 17+

Maven

MySQL

Steps

Configure database in application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/fitness_db
spring.datasource.username=your_username
spring.datasource.password=your_password


Build & run

mvn spring-boot:run


Test APIs

http://localhost:8080


Use Postman for API testing.

🧪 Testing

Manual API testing using Postman

Verified CRUD operations and validations

Proper exception and error responses

🎯 What I Learned

Designing real-world RESTful APIs

Implementing Spring Boot backend architecture

Working with JPA & Hibernate

Database modeling with MySQL

Backend debugging and testing practices

📈 Future Improvements

JWT-based authentication

Role-based authorization

API documentation with Swagger

Dockerization

Microservices migration

👨‍💻 Author

Vikas Pradhan

GitHub: https://github.com/VKS1572

LinkedIn: https://www.linkedin.com/in/vikas-pradhan-14225021b/
