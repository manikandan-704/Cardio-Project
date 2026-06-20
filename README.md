# 🏋️ Fitness Application - Java Spring Boot AI Microservices

---

## 📋 Project Overview

This is a comprehensive **full-stack fitness application** built using modern **Java Spring Boot microservices architecture** with an **AI-powered recommendation engine**. The project demonstrates enterprise-grade application development patterns including service discovery, API gateway routing, centralized configuration, and a responsive React frontend.

### 🎯 What This Project Teaches

This hands-on course project covers:
- **Microservices Architecture**: Building scalable, independently deployable services
- **Spring Cloud**: Netflix OSS stack (Eureka, Config Server, API Gateway)
- **API Design**: RESTful API patterns and best practices
- **Frontend Integration**: React with modern tooling (Vite, Redux)
- **AI Integration**: Machine learning recommendations using Spring AI
- **Database Patterns**: Each service manages its own data
- **Production Readiness**: Logging, error handling, and monitoring patterns

---

## 🏗️ Architecture Overview

```
┌─────────────────────────────────────────────────────────────┐
│                         Frontend (React + Vite)             │
│                    http://localhost:5173                    │
└──────────────────────────┬──────────────────────────────────┘
                           │ HTTP/REST
┌──────────────────────────▼──────────────────────────────────┐
│                      API Gateway                            │
│              (Request Routing & Load Balancing)             │
└──┬─────────┬─────────┬──────────────────────────────────────┘
   │         │         │
   │         │         │         ┌────────────────────┐
   │         │         │         │  Eureka Registry   │
   │         │         │         │ (Service Discovery)│
   │         │         │         │ :8761              │
   │         │         │         └────────────────────┘
   │         │         │
   ▼         ▼         ▼
┌─────────┐ ┌─────────┐ ┌─────────┐  ┌────────────────┐
│  User   │ │Activity │ │   AI    │  │  Config Server │
│Service  │ │Service  │ │Service  │  │  (Centralized  │
│ :8081   │ │ :8082   │ │ :8083   │  │  Config) :8888 │
└─────────┘ └─────────┘ └─────────┘  └────────────────┘
```

### 🔧 Core Services

| Service | Port | Purpose |
|---------|------|---------|
| **Eureka** | 8761 | Service Registry & Discovery |
| **Config Server** | 8888 | Centralized Configuration Management |
| **API Gateway** | 9090 | Request Routing & Load Balancing |
| **User Service** | 8081 | User authentication, profiles, management |
| **Activity Service** | 8082 | Fitness activities tracking & history |
| **AI Service** | 8083 | AI-powered workout recommendations |
| **Frontend** | 5173 | React web application |

---

## 🛠️ Technology Stack

### Backend
- **Java 26** - Latest LTS Java version
- **Spring Boot 3.3+** - Modern Spring framework
- **Spring Cloud** - Microservices patterns (Eureka, Config, Gateway)
- **Spring Data JPA** - Database access
- **Spring AI** - AI/ML integration
- **Maven** - Dependency management & build
- **Lombok** - Boilerplate code reduction

### Frontend
- **React 18** - UI framework
- **Vite** - Fast build tool
- **Redux Toolkit** - State management
- **Axios** - HTTP client
- **Node.js / npm** - Package management

### Infrastructure & Tools
- **Docker & Compose** - Containerization (optional)
- **MySQL/H2** - Database
- **Postman/cURL** - API testing
- **Git** - Version control

---

## 📁 Project Structure

```
fitness-application/
├── 📄 README.md                    # This file
├── 📄 QUICK_START.md              # Fast setup guide
├── 📄 RUNNING_GUIDE.md            # Detailed instructions
├── 📄 FIX_SUMMARY.md              # Build fixes & solutions
│
├── 🚀 start-all.ps1               # Start all services (PowerShell)
├── 🚀 start-all.cmd               # Start all services (CMD)
├── ✅ check-prerequisites.ps1     # Verify setup
│
├── 📚 eureka/                     # Service Registry
│   ├── pom.xml
│   ├── src/main/java/...
│   └── target/eureka-0.0.1-SNAPSHOT.jar
│
├── ⚙️ configserver/               # Config Server
│   ├── pom.xml
│   ├── src/main/java/...
│   └── target/configserver-0.0.1-SNAPSHOT.jar
│
├── 🌉 gateway/                    # API Gateway
│   ├── pom.xml
│   ├── src/main/java/...
│   └── target/gateway-0.0.1-SNAPSHOT.jar
│
├── 👤 userservice/                # User Management microservice
│   ├── pom.xml
│   ├── src/main/java/...
│   └── target/userservice-0.0.1-SNAPSHOT.jar
│
├── 🏃 activityservice/            # Activity Tracking microservice
│   ├── pom.xml
│   ├── src/main/java/...
│   └── target/activityservice-0.0.1-SNAPSHOT.jar
│
├── 🤖 aiservice/                  # AI Recommendations microservice
│   ├── pom.xml
│   ├── src/main/java/...
│   └── target/aiservice-0.0.1-SNAPSHOT.jar
│
└── 🎨 fitness-app-frontend/       # React Application
    ├── package.json
    ├── vite.config.js
    ├── index.html
    ├── src/
    │   ├── App.jsx
    │   ├── components/
    │   ├── services/
    │   └── store/
    └── public/
```

---

## 🚀 Quick Start

### Prerequisites
- **Java 26+** ([Download](https://jdk.java.net/))
- **Node.js 16+** ([Download](https://nodejs.org/))
- **Maven** (included with project)
- **Git**

### Start All Services in One Command

```powershell
cd C:\Users\Manikandan\Desktop\Fitness
.\start-all.ps1
```

Then open your browser: **[http://localhost:5173](http://localhost:5173)**

### Manual Service Startup

If you prefer to start services individually, see [QUICK_START.md](QUICK_START.md) or [RUNNING_GUIDE.md](RUNNING_GUIDE.md).

---

## ✨ Key Features

- ✅ **Microservices Architecture** - Independently scalable services
- ✅ **Service Discovery** - Eureka automatic service registration
- ✅ **Centralized Configuration** - Spring Cloud Config Server
- ✅ **API Gateway** - Single entry point for all backend services
- ✅ **User Authentication** - Secure user management
- ✅ **Activity Tracking** - Log and monitor fitness activities
- ✅ **AI Recommendations** - Smart workout suggestions using ML
- ✅ **Responsive Frontend** - Modern React UI with Redux state management
- ✅ **RESTful APIs** - Clean, documented REST endpoints
- ✅ **Error Handling** - Comprehensive exception handling & logging
- ✅ **Production Ready** - Follows enterprise development patterns

---


## 📖 Documentation

| Document | Purpose |
|----------|---------|
| [QUICK_START.md](QUICK_START.md) | 🚀 Get running in 10 seconds |
| [RUNNING_GUIDE.md](RUNNING_GUIDE.md) | 📚 Detailed setup & troubleshooting |
| [FIX_SUMMARY.md](FIX_SUMMARY.md) | 🔧 Build issues & solutions |

---

## 🧪 API Endpoints

### User Service (Port 8081)
```
GET  /api/users           - List all users
GET  /api/users/{id}      - Get user by ID
POST /api/users           - Create new user
PUT  /api/users/{id}      - Update user
DELETE /api/users/{id}    - Delete user
```

### Activity Service (Port 8082)
```
GET  /api/activities           - List activities
GET  /api/activities/{id}      - Get activity details
POST /api/activities           - Log new activity
PUT  /api/activities/{id}      - Update activity
DELETE /api/activities/{id}    - Delete activity
```

### AI Service (Port 8083)
```
GET  /api/recommendations      - Get AI recommendations
POST /api/recommendations      - Generate new recommendations
GET  /api/analyze             - Analyze fitness data
```

> All endpoints are accessed through the API Gateway: `http://localhost:9090/api/...`

---

## 🐛 Troubleshooting

### Port Already in Use
```powershell
taskkill /IM java.exe /F
```

### Services Not Starting
```powershell
cd C:\Users\Manikandan\Desktop\Fitness
Get-ChildItem -Directory | Where-Object { Test-Path "$($_.FullName)\pom.xml" } | ForEach-Object {
    Push-Location $_.FullName
    & ./mvnw.cmd clean package -DskipTests
    Pop-Location
}
.\start-all.ps1
```

### Check Service Status
- **Eureka Dashboard**: [http://localhost:8761](http://localhost:8761)
- **Config Server**: [http://localhost:8888](http://localhost:8888)
- **Frontend**: [http://localhost:5173](http://localhost:5173)

For more help, see [RUNNING_GUIDE.md](RUNNING_GUIDE.md) or [FIX_SUMMARY.md](FIX_SUMMARY.md).

---

## 🎓 Learning Outcomes

- ✅ How to design and implement microservices
- ✅ Service discovery and registry patterns
- ✅ API gateway and routing strategies
- ✅ Centralized configuration management
- ✅ Building REST APIs with Spring Boot
- ✅ Frontend-backend integration with React
- ✅ Database design for distributed systems
- ✅ AI/ML integration in applications
- ✅ Error handling and logging
- ✅ Production-ready code patterns



## Thank You

---

**Last Updated:** June 20, 2026
