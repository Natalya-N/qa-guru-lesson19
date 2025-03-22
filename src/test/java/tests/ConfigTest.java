package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ConfigTest {

    @Test
    void openPageTest() {
        step("Открыть страницу", () -> {
            open("/");
            $("[src=\"https://samokat.ru/images/logo.svg\"]").shouldBe(visible);
        });
    }

}
