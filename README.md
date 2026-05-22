# LibraryApp

A simple Java microservice with SQLite backend

## System Architecture

```mermaid
graph TB
    Client["Client Application"]
    
    Client -->|HTTP Requests| Gateway["API Gateway<br/>(Spring Cloud Gateway)"]
    
    Gateway -->|Route to Services| Eureka["Eureka Server<br/>(Service Registry)"]
    Gateway -->|Load Balanced<br/>Requests| BookSvc["Book Details Service<br/>(Spring Boot + JPA)"]
    
    BookSvc -->|Register/Discover| Eureka
    BookSvc -->|Queries| DB["SQLite Database"]
    
    Utils["Common Utils<br/>(Shared Library)"]
    
    Gateway -.->|Uses| Utils
    BookSvc -.->|Uses| Utils
    
    Eureka -->|Health Checks &<br/>Instance Metadata| Eureka
    
    style Client fill:#e1f5ff
    style Gateway fill:#fff3e0
    style Eureka fill:#f3e5f5
    style BookSvc fill:#e8f5e9
    style DB fill:#fce4ec
    style Utils fill:#f1f8e9
```

### Architecture Components

- **API Gateway** - Entry point for all client requests using Spring Cloud Gateway with load balancing
- **Eureka Server** - Service registry and discovery for dynamic service management
- **Book Details Service** - Core microservice for book information management (Spring Boot + JPA + Hibernate)
- **SQLite Database** - Lightweight data persistence layer
- **Common Utils** - Shared library with reusable components across microservices

### Technology Stack

- Spring Boot 4.0.6
- Java 21
- Spring Cloud 2025.1.1
- Hibernate ORM
- SQLite Database
- Swagger/OpenAPI Documentation

## API Documentation

Swagger link:
http://localhost:8080/swagger-ui/index.html
