# Food-Api

API RESTful para cadastro e gerenciamento de alimentos, desenvolvida em Java com Spring Boot.

[![License](https://img.shields.io/badge/license-MIT-blue)](#-licença)
[![Language](https://img.shields.io/badge/language-Java_17-orange)]()
[![Framework](https://img.shields.io/badge/framework-Spring_Boot-green)]()

## 📌 Sumário
- [Sobre](#-sobre)
- [Tecnologias](#-tecnologias)
- [Requisitos](#-requisitos)
- [Execução](#-execução)
- [Endpoints Principais](#-endpoints-principais)
- [Testes](#-testes)
- [Contribuição](#-contribuição)
- [Licença](#-licença)

---

## 📖 Sobre
A **Food-Api** é uma aplicação voltada ao gerenciamento do catálogo de alimentos, fornecendo rotas completas para criação, listagem, atualização e remoção de registros (CRUD).

---

## 🛠 Tecnologias
* **Java 17**
* **Spring Boot**
* **Spring Data JPA**
* **Maven**
* **Springdoc OpenAPI (Swagger)**

---

## 📋 Requisitos
* **JDK 17** ou superior
* **Maven 3.8+** (ou uso do `./mvnw` incluso no projeto)
* **Docker** (opcional)

---

## 🚀 Execução

```bash
# Compilar o projeto sem rodar testes
./mvnw clean package -DskipTests

# Executar o JAR gerado
java -jar target/food-api-0.0.1-SNAPSHOT.jar

# Ou rodar em modo desenvolvimento
./mvnw spring-boot:run
