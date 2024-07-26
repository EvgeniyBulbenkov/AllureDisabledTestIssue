# Allure Junit5 Suites Error Example

## Overview

This project demonstrates the issue in the functioning of the Allure report (Allure-Junit5) when applying the `parentSuite` labels to
tests that are marked as `@Disabled`.

## Stack:

- Java 17
- Junit 5
- Allure (Allure-junit5)

## Issue Description

Test run contains 15 tests divided into 3 classes.  

java.extensions.TestSuitesExtension.java - Extension class responsible for marking labels `parentSuite` based on the TmsLink label's data.


When all test are enable, all tests are grouped into the appropriate suites the report looks the following: (Parent suite based on the `parentSuite` label, then class-level @DisplayName annotation's data)
![allTestsEnabled.png](img%2FallTestsEnabled.png)

But when some test are disabled, `parentSuite` label not applied for the disabled tests 
![disabledTests.png](img%2FdisabledTests.png)
![disabledTests_1.png](img%2FdisabledTests_1.png)
![disabledTests_2.png](img%2FdisabledTests_2.png)

As a result, all disabled tests are creating additional suites based on the class-level annotation @DisplayName

**In the console displayed the error: ERROR io.qameta.allure.AllureLifecycle - Could not update test case: no test case running**
