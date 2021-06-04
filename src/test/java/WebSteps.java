import com.codeborne.selenide.Condition;
import com.google.gson.annotations.SerializedName;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {
    @Step("Open GitHub")
    public void openMainPage(){
        open("https://github.com");
    }

    @Step("Search and open selenide repository {repository}")
    public void openSelenideRepository(String repository){
        $(byName("q")).setValue(repository).pressEnter();
        $(By.linkText("selenide/selenide")).click();
    }

    @Step("Go to Issues")
    public void goToIssues(){
        $(withText("Isues")).click();
    }

    @Step("Assert That Element 1479 exist")
    public void assertThatElementExist(){
        $(withText("#1479")).should(Condition.exist);
    }
}
