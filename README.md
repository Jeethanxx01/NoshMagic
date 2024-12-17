# Ordering Website Backend

This project is a monolithic architecture backend solution for an ordering website built using **Spring Boot**. It facilitates user and restaurant owner roles with distinct functionalities, ensuring a seamless experience through APIs. The backend leverages **Lombok**, **JDBC Driver**, **Hibernate**, and adheres to **OOP principles** for maintainable and readable code.


## Features

### User Role
- **Authentication**:
  - Sign up and log in to obtain a JWT token.
  - Log in using the JWT token for secure access.
- **Restaurant Browsing**:
  - View restaurants by their ID.
- **Ordering**:
  - Add food items to the cart.
  - Place orders and customize them by selecting ingredients.
  - View order history.
- **Food Browsing**:
  - Search for food items by their ID or name.

### Restaurant Owner Role
- **Restaurant Management**:
  - Add new restaurants to the system.
- **Menu Management**:
  - Add food items to the menu.
  - Add customizable ingredients for food items.
  - Set prices for food items.
- **Order Management**:
  - Accept or reject orders.
  - View all orders for the restaurant.


## Technology Stack
- **Spring Boot**: Core framework for the backend.
- **Lombok**: Simplifies boilerplate code such as getters, setters, and constructors.
- **Hibernate**: ORM tool for database interactions.
- **JDBC Driver**: For managing database connections.
- **JWT (JSON Web Token)**: Secure authentication and authorization.
- **OOP Principles**: Clean and maintainable code architecture.


## API Endpoints

### Authentication
- **POST** `/auth/signup`: User or restaurant owner registration.
- **POST** `/auth/login`: Log in and obtain a JWT token.

### User-Specific Endpoints
- **GET** `/restaurants/{id}`: Browse restaurant by ID.
- **POST** `/cart`: Add items to the cart.
- **POST** `/orders`: Place an order with customizations.
- **GET** `/orders`: View order history.

### Restaurant Owner-Specific Endpoints
- **POST** `/restaurants`: Add a restaurant.
- **POST** `/restaurants/{id}/food`: Add a food item to a restaurant.
- **POST** `/restaurants/{id}/food/{foodId}/ingredients`: Add customizable ingredients.
- **POST** `/restaurants/{id}/food/{foodId}/price`: Set the price for a food item.
- **PATCH** `/orders/{id}`: Accept or reject an order.
- **GET** `/restaurants/{id}/orders`: View all orders for the restaurant.
## Dependencies

- Spring Boot Starter Web: For creating REST APIs.
- Spring Boot Starter Security: For authentication and authorization.
- Spring Boot Starter Data JPA: For database operations.
- Lombok: To reduce boilerplate code.
- JWT: For secure token-based authentication.



## Code Structure

- Controller Layer: Handles HTTP requests.
- Service Layer: Business logic implementation.
- Repository Layer: Interacts with the database.
- Model Layer: Defines entities and data structures.
