# spring-boot-projects
My spring boot learning projects and REST APIs

# Spring Boot Student API

This is my first Spring Boot web application created using Java and Spring Boot.

## Technologies Used

- Java
- Spring Boot
- Maven
- REST API
- Git & GitHub

## Features

- Created a Spring Boot application
- Created a REST Controller
- Created a simple GET API
- Tested the API using a web browser

## API Endpoint

GET `/hello`

Response:

Hello, Spring Boot!

## How to Run

1. Clone the repository
2. Open the project in VS Code or Eclipse
3. Run `StudentApiApplication.java`
4. Open the browser and visit:

`http://localhost:8080/hello`

## Project Status

Basic Spring Boot REST API completed successfully.


Spring Boot Demo

This is my first Spring Boot project.

Technologies

- Java
- Spring Boot
- Maven

Features

- Created a REST Controller
- Created a simple GET API
- Returns a Hello World message

How to Run

Run "DemoApplication.java" and open:

"http://localhost:8080/"

MyApp
My first Spring Boot project.
Learned
Spring Boot
Spring IoC
@Component
ApplicationContext
getBean()
Output
I am building project 



Spring Boot Dependency Injection
In this project, I learned and implemented Dependency Injection using @Autowired in Spring Boot.
Concepts Learned
@Autowired
Field Injection
Setter Injection
Constructor Injection
@Component
Interface-based Dependency Injection


Spring Boot @Primary and @Qualifier
In this project, I learned how to handle multiple beans of the same type using @Primary and @Qualifier.
Concepts Learned
@Primary
@Qualifier
Multiple Spring Beans
Dependency Injection
@Autowired


# Simple1 - Spring Boot Project

This is a simple Spring Boot project created to learn basic Spring Boot annotations.

## Concepts Learned

- @Controller
- @RequestMapping
- @ResponseBody
- @RestController

## Output

The application returns:

"Welcome to Ash Projects"

## Technologies

- Java
- Spring Boot
- Maven


# Spring Boot Product API

Simple Spring Boot project created while learning Spring MVC and REST API.

## Technologies
- Java
- Spring Boot
- Spring MVC
- REST API
- JSON

## Concepts Learned
- @RestController
- @Service
- @Autowired
- @RequestMapping
- Getter and Setter
- JSON

## API

GET `/products`

Returns product details in JSON format.

## Example

[
  {
    "name": "Iphone",
    "id": 101,
    "price": 10000
  },
  {
    "name": "Andriod",
    "id": 102,
    "price": 20000
  }
]

#comcept leaned
@GetMapping
@PostMapping
and tested using postman tool


Spring Boot Product API

This is my simple Spring Boot project for learning REST APIs.

Technologies

- Java
- Spring Boot
- Postman

Operations

- GET - Get products
- POST - Add product
- PUT - Update product
- DELETE - Delete product

Testing

I tested the APIs using Postman.

What I Learned

- REST API
- Controller
- Service
- "@RequestBody"
- "@PathVariable"
- GET, POST, PUT and DELETE


# Spring Boot Product API

This is a simple Spring Boot project created to learn backend development using Java and Spring Boot.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- REST API
- Postman
- Maven

## Features

- Create Product
- Get Product
- Update Product
- Delete Product
- Store product data using H2 database
- Test REST APIs using Postman

## Database

This project uses H2 in-memory database.

H2 Console:

http://localhost:8094/h2-console

JDBC URL:

jdbc:h2:mem:test

## Product Details

The Product table contains:

- Product ID
- Product Price
- Product Name

## How to Run

1. Clone the project.
2. Open the project in VS Code or IntelliJ.
3. Run the Spring Boot application.
4. The application runs on:

http://localhost:8094

5. Use Postman to test the APIs.

## Learning Progress

This project helped me understand:

- Spring Boot REST APIs
- JPA and Hibernate
- H2 Database
- Connecting Spring Boot with a database
- CRUD operations
- Testing APIs using Postman


# Product Management REST API

A simple REST API built using Spring Boot to manage product information.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- H2 Database
- Lombok
- Postman

## Features

- Get all products
- Store product details in H2 database
- Use JPA/Hibernate for database operations
- REST API for accessing product data
- Test API using Postman and Browser

## Project Structure

```text
src
└── main
    ├── java
    │   └── com.example.ecom
    │       ├── controller
    │       ├── service
    │       ├── repository
    │       └── model
    │
    └── resources
        ├── application.properties
        └── data.sql


# E-Commerce Product Backend

A simple REST API backend built using Java and Spring Boot.
This project performs CRUD operations for products.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2 Database
- REST API
- Maven
- Postman
- Git & GitHub

## Features

- Add a product
- Get all products
- Get product by ID
- Update a product
- Delete a product
- Search products
- Product image upload and retrieval

## API Endpoints

### Get All Products

```http
GET /api/product


# Spring Security Learning Project 🔐

This project is created while learning **Spring Security with Spring Boot**.

The main goal of this project is to understand how Spring Security provides authentication and protects Spring Boot REST APIs.

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Web
- Maven

## 📚 What I Learned

- Adding Spring Security to a Spring Boot project
- Understanding default Spring Security configuration
- Default username and generated password
- Authentication using Spring Security
- Securing REST endpoints
- Spring Security login page
- Logout functionality
- Understanding HTTP request authentication

## 🔐 Default Security

When Spring Security is added without custom configuration, Spring Security automatically creates a default user.

The username is:

```text
user
