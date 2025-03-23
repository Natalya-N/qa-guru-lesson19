package tests;

import jdk.jfr.Description;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("simple")
public class ConfigTest extends TestBase {

    @Test
    @Description("Открыть главную страницу и проверить лого")
    void openPageTest() {
        step("Открыть страницу", () -> {
            open("/");
            $("[src=\"https://samokat.ru/images/logo.svg\"]").shouldBe(visible);
        });
    }

}
