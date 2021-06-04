import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AllureTestWithLambda {

    @Test
    public void allureTestWithLambda() {
        step("Open GitHub", (s) -> {
            open("https://github.com/");
        });
        step("Search and open selenide repository", (s) -> {
            $(byName("q")).setValue("selenide").pressEnter();
            $(By.linkText("selenide/selenide")).click();
        });
        step("Go to Issues", (s) -> {
            $(withText("Issues")).click();
        });
        step("Assert That Element 1479 exist", (s) -> {
            $(withText("#1479")).should(Condition.exist);
        });
    }
}
