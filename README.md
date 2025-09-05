# 🛒 Naaptol E-Commerce Automation Testing (Selenium + BDD + Cucumber)

This repository contains **automation test scripts** for the [Naaptol](https://www.naaptol.com/) e-commerce platform.  
The framework is built using **Selenium WebDriver, BDD (Cucumber), and TestNG/JUnit**, following the **Page Object Model (POM)** design pattern.  

---

## 📌 Features
- ✅ End-to-End automation of Naaptol user flows (search, add to cart, checkout, etc.)
- ✅ Implemented **BDD (Cucumber)** with **Gherkin syntax** for better readability
- ✅ Integrated **Selenium WebDriver** for browser automation
- ✅ Test execution with **TestNG/JUnit runners**
- ✅ **Page Object Model (POM)** for scalable and maintainable code
- ✅ **Reusable utility functions** for waits, assertions, and reporting
- ✅ Cross-browser testing support
- ✅ Test Reports (Extent / Cucumber HTML Reports)

---

## 🏗️ Project Structure
Naaptol-Automation/
│── src/main/java/
│ ├── pages/ # Page Object Model classes
│ ├── utils/ # Utility classes (Waits, ConfigReader, etc.)
│
│── src/test/java/
│ ├── features/ # Cucumber Feature files
│ ├── stepDefinitions/ # Step Definitions for BDD
│ ├── runners/ # Test Runners (TestNG/JUnit)
│ ├── tests/ # Test Classes
│
│── reports/ # Cucumber/Extent Reports
│── pom.xml # Maven dependencies


---

## 🚀 Tools & Tech Stack
- **Programming Language**: Java  
- **Automation Tool**: Selenium WebDriver  
- **Framework**: BDD (Cucumber) with TestNG/JUnit  
- **Design Pattern**: Page Object Model (POM)  
- **Build Tool**: Maven  
- **Reporting**: Extent Reports / Cucumber HTML Reports  
- **Version Control**: GitHub  

---

## 📊 Test Scenarios Covered
- 🔍 Product Search  
- 🛒 Add to Cart  
- 🏷️ Apply Coupon / Offers  
- 💳 Checkout & Payment Flow  
- 👤 Login / Registration  
- ❌ Negative Scenarios (invalid login, invalid coupon, etc.)

---

## 📄 How to Run Tests
1. Clone the repo:  
   ```bash
   git clone https://github.com/Shivshanker869/firstpost_Naaptol.git
