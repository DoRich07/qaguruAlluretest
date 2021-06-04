import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AllureTestWithSteps {
    private WebSteps steps = new WebSteps();

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void allureTestWithSteps() {
        steps.openMainPage();
        steps.openSelenideRepository("selenide/selenide");
        steps.goToIssues();
        steps.assertThatElementExist();
    }
}