# Swiggy - Spring Boot REST API

A simple Spring Boot REST API project that simulates the basic functionality of the Swiggy food ordering system. This project demonstrates CRUD operations using Spring Boot, Spring Data JPA, and MySQL.

##  Features

- Create Order
- View All Orders
- Get Order by ID
- Update Order
- Delete Order
- Create Payment
- View All Payments
- Get Payment by ID
- Update Payment
- Delete Payment

---

##  Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- MySQL
- REST API
- IntelliJ IDEA
- Postman

---

##  Project Structure

```
src
 └── main
     ├── java
     │    └── com.skillfirstlab.swiggy
     │         ├── controller
     │         │      ├── OrderController
     │         │      └── PaymentController
     │         ├── entity
     │         │      ├── Order
     │         │      └── Payment
     │         ├── repository
     │         │      ├── OrderRepository
     │         │      └── PaymentRepository
     │         ├── service
     │         │      ├── OrderService
     │         │      └── PaymentService
     │         └── SwiggyApplication
     └── resources
           ├── application.properties
```

---

##  Installation

Clone the repository

```bash
git clone https://github.com/raghulsiva08/swiggy.git
```

Go to the project folder

```bash
cd swiggy
```

Build the project

```bash
mvn clean install
```

Run the application

```bash
mvn spring-boot:run
```

The application will start at

```
http://localhost:8080
```

---

##  API Endpoints

### Order APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | /orders | Create Order |
| GET | /orders | Get All Orders |
| GET | /orders/{id} | Get Order by ID |
| PUT | /orders/{id} | Update Order |
| DELETE | /orders/{id} | Delete Order |

---

### Payment APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | /payments | Create Payment |
| GET | /payments | Get All Payments |
| GET | /payments/{id} | Get Payment by ID |
| PUT | /payments/{id} | Update Payment |
| DELETE | /payments/{id} | Delete Payment |

---

##  Testing

Use **Postman** to test all REST API endpoints.

Example:

**Create Order**

POST

```
http://localhost:8080/orders
```

Body

```json
{
    "customerName":"Raghul",
    "foodName":"Burger",
    "quantity":2,
    "price":250
}
```

---

##  Database

Configure your MySQL database in

```
src/main/resources/application.properties
```

Example

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/swiggy
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---
## Output
<img width="1600" height="899" alt="WhatsApp Image 2026-07-11 at 10 42 58 AM" src="https://github.com/user-attachments/assets/ecef1c1f-e3aa-4a06-b759-1218046b73f4" />

<img width="1403" height="567" alt="WhatsApp Image 2026-07-11 at 10 31 59 AM" src="https://github.com/user-attachments/assets/c5cdf6f5-b7f1-4bd7-a43b-8f7ad987e806" />
<img width="1133" height="637" alt="WhatsApp Image 2026-07-11 at 10 32 10 AM" src="https://github.com/user-attachments/assets/9b8a4840-b1f2-48ff-8803-7d7d36fd7d90" />


## Author

**Raghul S**

- BE Computer Science Engineering
- Saveetha Engineering College

---

##  License

This project is created for learning Spring Boot and REST API development.
