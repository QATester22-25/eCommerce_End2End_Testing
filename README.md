**This is an End2End eCommerce Page_Object_Model Project using Allure reports**

*Description:*

This project automates end to end testing of an e-commerce demo website using **Selenium WebDriver** , **Java** and **Testng**
It validates core functionalities such as user registration and login , product autosuggest search , sort product , cart operations , checkout and order confirmation.

🧰 *Tools & Technologies Used*

- ⚙️ **Java 17**
- 🌐 **Selenium WebDriver**
- 🧪 **TestNG**
- 📦 **Maven** for dependency management
- 🧾 **AllureReports** for test reporting
- 💻 **Eclipse IDE**

  📁 *Project Structure*

E-commerce_testing_Project/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├──pages/
│ ├── test/
│ │ ├── java/
│ │ │ ├──tests/
├── pom.xml
├── testng.xml

⚙️ *Parameters & Configuration*

**Browser Setup:** Browser type passed as TestNG parameter ("chrome","firefox","edge")
**TestNG Suite:** 'testng.xml' manages suite execution
**Base URL:** Set in testBase class

🚀 *How to Run the Tests*

1. Clone the repository:
   
bash
   git clone https://github.com/your-username/eCommerce_End2End_Testing.git

3. Import the project in Eclipse or IntelliJ

4. Run tests using:
Maven:

bash
  mvn test

  or by right-clicking on testng.xml and selecting Run as > TestNG Suite


📈 *Test Reports*

Test execution reports are generated under:

bash
  /test-output/index.html











* Multi Browsers testng parameter version
* Allure-reports integrated with this POM Project
* You have to put the 'email' test_data in *RegistrationTest class to succeed the test Suite!
* 
