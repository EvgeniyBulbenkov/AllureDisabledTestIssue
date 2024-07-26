package org.example.junit5;

import extensions.TestSuitesExtension;
import io.qameta.allure.Allure;
import io.qameta.allure.TmsLink;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(TestSuitesExtension.class)
@DisplayName("FE: Service 777")
public class SuiteOneTest {

    @Test
    @TmsLink("FE-001")
    @DisplayName("First frontend test")
    public void firstFrontendTest() {

    }

    @Test
    @TmsLink("FE-002")
    @DisplayName("Second frontend test")
    public void secondFrontendTest() {

    }

    @Test
    @TmsLink("FE-003")
    @DisplayName("Third frontend test")
    public void thirdFrontendTest() {

    }

    @Test
    @TmsLink("FE-004")
    @DisplayName("Fourth frontend test")
    @Disabled
    public void fourthFrontendTest() {

    }

    @Test
    @TmsLink("FE-005")
    @DisplayName("Fifth frontend test")
    public void fifthFrontendTest() {

    }
}
