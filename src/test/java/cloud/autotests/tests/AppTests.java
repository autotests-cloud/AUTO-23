package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static com.codeborne.selenide.Selectors.byAttribute;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Selenide search test")
    void test() {

        step("Open https://google.com", () ->
            open("https://google.com")
        );

        step("Type 'selenide' to search input", () -> {
            $(byAttribute("name", "q")).val("selenide").pressEnter();
        });

        step("Verify, search results have text 'selenide.org'", () -> {
            $("#rcnt").shouldHave(text("selenide.org"));
        });

    }
}