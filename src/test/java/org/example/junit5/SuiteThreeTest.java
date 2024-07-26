package org.example.junit5;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BE: Service 007")
public class SuiteThreeTest {

    @Test
    @DisplayName("First database test")
    public void firstIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }

    @Test
    @DisplayName("Second database test")
    public void secondIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }

    @Test
    @DisplayName("Third database test")
    public void thirdIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }

    @Test
    @DisplayName("Fourth database test")
    public void fourthIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }

    @Test
    @DisplayName("Fifth database test")
    public void fifthIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }
}
