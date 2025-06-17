# 🚀 WonderRx Web Automation

Automated UI testing for the **WonderRx "About" page** using Selenium and TestNG.  
This project validates key UI elements and hyperlinks to ensure the web page is functioning as expected.

-----

## 📌 Project Overview

This automation framework is designed to:
- Test UI elements on the **WonderRx About page**
- Verify the validity of hyperlinks (response codes, availability)
- Log output to the console for manual test verification

-----

## 🧰 Tech Stack

| Tool              | Purpose                                |
|-------------------|----------------------------------------|
| Java 21           | Programming language                   |
| Selenium WebDriver| Browser automation                     |
| TestNG            | Test framework                         |
| Maven             | Build & dependency management          |
| WebDriverManager  | Manages browser driver binaries        |

-----

## 📁 Project Structure

WonderRxWeb/
├── src/
│ ├── main/java/
│ │ └── wonderRxWeb/ # Page Object classes
│ └── test/java/
│ └── wonderRxWeb/Tests # TestNG test classes
├── testng.xml # Test execution configuration
├── pom.xml # Maven dependencies
└── README.md # Project documentation



-----

## 🖥️ Prerequisites

- **Java 21**
- **Eclipse IDE** (or any Java IDE)
- **Chrome Browser**
- Internet connection (for WebDriverManager to fetch the driver)

-----

## ⚙️ Setup Instructions

1. Clone the repository:

```bash
git clone https://github.com/GaneshGuddeti/WonderRxWeb.git
cd WonderRxWeb

2. Import the project into Eclipse as a Maven project.

3. Maven will automatically resolve dependencies from the pom.xml:

- Selenium

- TestNG

- WebDriverManager

4. Ensure Java 21 is selected as the runtime.

--------
How to Run Tests
Run the project using the testng.xml file:

In Eclipse:

Right-click on testng.xml → Run As → TestNG Suite

-----------
Reporting
Test results are displayed in the console.

We can optionally integrate ExtentReports for advanced reporting.

-------------
Conventions
Branch: Master

Code Style: Follows Java best practices with OOP principles and the Page Object Model (POM).

Designed for maintainability and scalability.

-------------


Author
Developed and maintained by Ganesh Guddeti

----------------------------------



