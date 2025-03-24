# Automated Web Testing with TestNG

📌 Project Overview

✅ Visits a specified URL based on different test methods.

✅ Logs into the website with valid credentials.

✅ Completes the payment process and finalizes the order.

🛠️ Technologies Used

-Java – Programming language

-TestNG – Test automation framework

-Selenium WebDriver – Browser automation

-Maven – Build and dependency management

⚙️ Setup & Installation

1️⃣ Prerequisites

✅ Java JDK (17+ recommended)

✅ Maven

✅ TestNG

✅ Selenium WebDriver

✅ A web browser (Chrome, Edge, or Firefox)

2️⃣ Clone the Repository

-git clone https://github.com/yourusername/testng-automation.git
-cd testng-automation

3️⃣ Install Dependencies

mvn clean install

4️⃣ Configure Test Data

baseURL = https://www.saucedemo.com

username = testuser

password = securepassword

browser = chrome

5️⃣ Run the Tests

mvn test

mvn test -Dtest=LoginTest


mvn test -Dbrowser=firefox

📝 Test Scenarios

✅ 1. Visit the Website

-Open the target URL

-Verify that the homepage loads correctly

✅ 2. Login Process

-Enter a valid username and password

-Verify successful login with user dashboard access

✅ 3. Payment Process

-Navigate to checkout

-Select a payment method

-Complete the order and verify confirmation
