package org.example.junit5;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BE: Service 2")
public class SuiteTwoTest {

    @Test
    @DisplayName("First integration test")
    @Disabled("Not implemented")
    public void firstIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }

    @Test
    @DisplayName("Second integration test")
    public void secondIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }

    @Test
    @DisplayName("Third integration test")
    public void thirdIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }

    @Test
    @DisplayName("Fourth integration test")
    public void fourthIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }

    @Test
    @DisplayName("Fifth integration test")
    public void fifthIntegrationTest() {
        Allure.label("parentSuite", "BE");
    }
}
