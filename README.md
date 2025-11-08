# 🧪Selenium WebDriver Automation (DemoBank)👨‍🎓
---

# 🏦 End-to-End Banking Domain Automation Project

[![Selenium Tests](https://img.shields.io/badge/Selenium%20Tests-passing-brightgreen)](https://github.com/your-username/repo-name/actions)

## 📘 Overview

This project is a **Selenium WebDriver** automation framework built using **Java** and **TestNG**. It is designed around a real-world banking application, simulating complex customer and bank manager workflows.

This repository is created to help QA engineers and beginners learn how to:
* Build a scalable automation framework using the **Page Object Model (POM)**.
* Organize and execute tests using TestNG annotations (`@BeforeMethod`, `@Test`, etc.).
* Manage dependencies with **Maven**.
* **Future Scope:** Integrate and run tests automatically in CI/CD using GitHub Actions and Jenkins.

## 🧰 Tech Stack

| Tool | Description |
| :--- | :--- |
| Selenium WebDriver | Browser automation library for UI and functional testing. |
| Java | Programming language for scripting the framework. |
| TestNG | Testing framework for test orchestration, grouping, and reporting. |
| Maven | Build and dependency management tool. |
| GitHub Actions | Continuous Integration / CI (Future Scope). |
| Jenkins Pipeline | Continuous Integration / CI (Future Scope). |

## 🧩 Project Structure
demoqa-automation-25/
┣ extent-reports/                      ### Generated test reports (ExtentReports) showing test results
┣ logs/                                ### Log output files (e.g., execution logs, error logs)
┣ src/  
┃ ┣ main/  
┃ ┃ ┗ java/com.demoqa/pages/           ### Page Object Model (POM) classes representing UI pages
┃ ┃ ┗ resources/                       ### Log4j2 configuration file (log4j2.xml) for logging setup
┃ ┗ test/  
┃ ┃ ┗ java/com.demoqa/tests/           ### Test scripts with @Test annotations  
┃ ┃ ┗ resources/                       ### Test resources (config files, screenshots, test data)
┃ testRunner/
┃ ┣ batchFile/                         ### Batch files (.bat) for executing tests via Jenkins
┃ ┣ suiteFiles/                        ### TestNG suite XML files (e.g., regression.xml, sanity.xml)
┣ pom.xml                              ### Maven project configuration file
┣ Jenkinsfile                          ### Jenkins Pipeline workflow for Selenium tests
┣ README.md                            ### Project documentation and instructions (GitHub)
┗ .github/workflows/selenium.yml       ### GitHub Actions CI/CD workflow for Selenium tests


---

## 🧠 Learning Goals

By working on this project, you'll gain hands-on experience in:

- ✅ Building an automation framework with **Selenium & TestNG**
- ✅ Structuring your project using **Page Object Model (POM)**
- ✅ Running tests via **Maven**
---

## 🧑‍💻 Author

**Mahesh Patil**  
🎯 QA Automation Engineer | Passionate about CI/CD | Selenium + TestNG + Maven  
🔗 [![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin)](https://www.linkedin.com/in/mahesh-patil-907301211/)
---

## 🌟 Support

If this project helps you, please consider giving it a ⭐ on GitHub!

---



