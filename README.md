# Simple Product API - Java 17 with Spring 3

Welcome to my first Java project! This is a simple RESTful API for managing products, implemented in Java 17 with Spring 3. This project follows RESTful principles and implements HATEOAS (Hypermedia as the Engine of Application State) to provide a self-descriptive API.

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [HATEOAS Implementation](#hateoas-implementation)
- [Project Structure](#project-structure)

## Overview

This project serves as a foundation for building a simple Product Management System. It provides basic CRUD (Create, Read, Update, Delete) operations for products. By implementing RESTful principles, it ensures a clean and predictable API structure.

## Prerequisites

Before you start, make sure you have the following installed:

- [Java 17](https://adoptium.net/)
- [Spring Framework 3](https://spring.io/projects/spring-framework)
- [Maven](https://maven.apache.org/)

## Getting Started

1. Clone this repository to your local machine:

```bash
git clone https://github.com/giovani-f/simple-product-api-java.git
```

2. Navigate to the project directory:

```bash
cd simple-product-api-java
```

3. Build and run the project using Maven:

```bash
mvn clean install
mvn spring-boot:run
```

Your API should now be up and running at `http://localhost:8080`.

## API Endpoints

The following API endpoints are available:

- **GET /products**: Get a list of all products.
- **GET /products/{id}**: Get a product by ID.
- **POST /products**: Create a new product.
- **PUT /products/{id}**: Update a product by ID.

For detailed usage examples, you can refer to the API documentation or use tools like Postman or cURL.

## HATEOAS Implementation

This project incorporates HATEOAS to provide links that navigate through the API. When you access a resource, it includes links to related resources, making the API self-descriptive and easy to navigate.

## Project Structure

The project structure is organized as follows:

```
simple-product-api-java/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── product/
│   │   │               ├── controller/
│   │   │               ├── dtos/
│   │   │               ├── model/
│   │   │               └── repository/
│   │   └── resources/
│   └── test/
├── README.md
├── pom.xml
└── ...
```

- `controller`: Contains the API endpoints and request mapping.
- `dtos`: Defines the Data Transfer Objects (DTOs) for the API.
- `model`: Defines the Product model.
- `repository`: Manages data access and storage.