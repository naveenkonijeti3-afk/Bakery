# Home Bakery Order Management System

Full-stack student project using React + Spring Boot + Java 17 + MySQL/PostgreSQL + JPA/Hibernate.

## Features
- Customer order form: product, quantity, customization, delivery date/address/contact
- Automatic total calculation
- Order confirmation with customization summary and delivery status
- Baker dashboard: view, filter, and update order status
- REST API between React and Spring Boot
- JPA/Hibernate persistence
- Validation and meaningful HTTP responses
- Responsive UI

## Run backend
1. Create MySQL database `bakery_db` (or change settings for PostgreSQL).
2. Update `backend/src/main/resources/application.properties` with DB username/password.
3. From `backend`: `mvn spring-boot:run`

## Run frontend
From `frontend`:
```bash
npm install
npm run dev
```
Open the URL shown by Vite (normally http://localhost:5173).

## API
- `GET /api/products`
- `POST /api/orders`
- `GET /api/orders/{id}`
- `GET /api/orders`
- `PATCH /api/orders/{id}/status`

## GitHub
```bash
git init
git add .
git commit -m "Initial home bakery order management system"
git branch -M main
git remote add origin YOUR_GITHUB_REPOSITORY_URL
git push -u origin main
```
