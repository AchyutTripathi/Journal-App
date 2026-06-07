<div align="center">

# 📔 Journal App

**A secure, end-to-end RESTful journaling backend built with Spring Boot, MongoDB, and Spring Security.**

[![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=openjdk)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5-brightgreen?style=flat-square&logo=springboot)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-NoSQL-green?style=flat-square&logo=mongodb)](https://www.mongodb.com/)
[![Spring Security](https://img.shields.io/badge/Spring%20Security-Auth-blue?style=flat-square&logo=springsecurity)](https://spring.io/projects/spring-security)
[![Maven](https://img.shields.io/badge/Maven-Build-red?style=flat-square&logo=apachemaven)](https://maven.apache.org/)

</div>

---

## 📖 Overview

JournalApp is a personal journaling REST API where users can securely create, update, and manage their journal entries. Authentication is handled via Spring Security, entries are persisted in MongoDB, and the project follows a clean layered architecture — **Controller → Service → Repository**.

| | |
|---|---|
| **Type** | REST Backend API |
| **Security** | E2EE + Spring Security |
| **Database** | MongoDB (NoSQL) |
| **Language** | Java 17 |

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| **Spring Boot 3.5** | Application framework with embedded Tomcat, DI, and REST layer |
| **Spring Security** | Authentication & authorization — secures all endpoints |
| **Spring Data MongoDB** | Repository abstraction over MongoDB via `MongoRepository` |
| **MongoDB** | Flexible document store for journal entries and user profiles |
| **Lombok** | Reduces boilerplate with `@Getter`, `@Setter`, `@Builder`, etc. |
| **Maven** | Build tool and dependency manager (Maven Wrapper included) |

---

## ✨ Features

- 🔐 **User Registration & Login** — Create an account and authenticate securely via Spring Security
- 📝 **Journal Entry CRUD** — Create, read, update, and delete personal journal entries
- 🔒 **Secured Endpoints** — Each user can only access their own entries — fully isolated data
- 🗄️ **MongoDB Persistence** — Schema-flexible document storage for journal data and user profiles
- 🏗️ **Layered Architecture** — Clean separation: Controller, Service, Repository, and Entity layers
- 📦 **Maven Wrapper** — Run builds with `./mvnw` — no local Maven install required

---

## ✅ Prerequisites

- **Java JDK 17+**
- **MongoDB** — local instance or [MongoDB Atlas](https://www.mongodb.com/cloud/atlas)
- **Git**
- **Maven** *(optional — `mvnw` wrapper is included)*

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/AchyutTripathi/Journal-App.git
cd Journal-App
```

### 2. Configure MongoDB

Edit `src/main/resources/application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/journaldb
spring.data.mongodb.database=journaldb
```

> ⚠️ **Never commit secrets to version control.** Use environment variables or a `.env` file for production credentials.

### 3. Build and run

```bash
# Linux / macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

The API will be available at **`http://localhost:8080`**.

### 4. Run tests

```bash
./mvnw test
```

---

## 📡 API Endpoints

> 🔑 All `/journal` and `/user` routes require **HTTP Basic Authentication**.

### Public Routes

| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/public/create-user` | Register a new user account |
| `GET` | `/public/health-check` | Verify the server is running (no auth needed) |

### Journal Entries *(auth required)*

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/journal` | Get all entries for the authenticated user |
| `POST` | `/journal` | Create a new journal entry |
| `GET` | `/journal/{id}` | Get a specific entry by ID |
| `PUT` | `/journal/{id}` | Update an existing entry by ID |
| `DELETE` | `/journal/{id}` | Delete an entry by ID (owner only) |

### User Profile *(auth required)*

| Method | Endpoint | Description |
|---|---|---|
| `PUT` | `/user` | Update the authenticated user's profile |
| `DELETE` | `/user` | Delete the authenticated user's account |

---

## 📁 Project Structure

```
Journal-App/
├── src/
│   └── main/
│       ├── java/com/atripathi/journalApp/
│       │   ├── controller/     ← REST endpoints
│       │   ├── entity/         ← MongoDB document models
│       │   ├── repository/     ← MongoRepository interfaces
│       │   ├── service/        ← Business logic layer
│       │   └── config/         ← Spring Security configuration
│       └── resources/
│           └── application.properties
├── src/test/                   ← Unit & integration tests
├── .mvn/wrapper/               ← Maven wrapper JAR
├── mvnw / mvnw.cmd             ← Cross-platform build scripts
├── pom.xml                     ← Dependencies & build config
└── .gitignore
```

---

## 💡 Example Usage

**Register a new user**

```bash
curl -X POST http://localhost:8080/public/create-user \
  -H 'Content-Type: application/json' \
  -d '{"userName": "achyut", "password": "secret123"}'
```

**Create a journal entry**

```bash
curl -X POST http://localhost:8080/journal \
  -u achyut:secret123 \
  -H 'Content-Type: application/json' \
  -d '{"title": "Day One", "content": "Started my journaling journey today!"}'
```

**Get all your entries**

```bash
curl -X GET http://localhost:8080/journal \
  -u achyut:secret123
```

---

## 🤝 Contributing

Contributions are welcome!

```bash
# 1. Fork the repo on GitHub
# 2. Create a feature branch
git checkout -b feature/your-feature-name

# 3. Commit your changes
git commit -m "feat: describe your change"

# 4. Push and open a Pull Request
git push origin feature/your-feature-name
```

Please follow standard Java/Spring Boot conventions and add tests for new features where possible.

---

## 👤 Author

**Achyut Tripathi**
- GitHub: [@AchyutTripathi](https://github.com/AchyutTripathi)

---

<div align="center">
  Built with ☕ Java &nbsp;·&nbsp; 🍃 Spring Boot &nbsp;·&nbsp; 🍃 MongoDB
</div>
