package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Selenide search test")
    void test() {

        step("Open https://google.com", () -> {
            // todo
        });

        step("Type 'selenide' to search input", () -> {
            // todo
        });

        step("Verify, search results have text 'selenide.org'", () -> {
            // todo
        });

    }
}