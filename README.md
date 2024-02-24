# LoginPage Project

Welcome to the LoginPage project! This project is a simple web application built using Spring Boot and Thymeleaf, demonstrating basic login functionality with Spring Security.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)

## Features

- Provides a login page where users can input their username and password.
- Implements Spring Security for authentication.
- Upon successful login, redirects users to a welcome page.
- Demonstrates how to use Thymeleaf for server-side rendering.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- JDK (Java Development Kit) installed on your machine.
- Maven installed on your machine.
- Git installed on your machine (if you plan to clone the repository).

## Installation

To install and run this project locally, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/loginpage.git
   ```

2. Navigate to the project directory:

   ```bash
   cd loginpage
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

## Usage

To use this project:

1. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

2. Open your web browser and navigate to `http://localhost:8080/login` to access the login page.
3. Enter your username and password (you can use the predefined users specified in the `SecurityConfig` class).
4. Upon successful login, you will be redirected to the welcome page.
