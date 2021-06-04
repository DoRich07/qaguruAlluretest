import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CleanSelenideTest {
@Test
    public void cleanTestSelenide(){
    open("https://github.com/");
    $(byName("q")).setValue("selenide").pressEnter();
    $(By.linkText("selenide/selenide")).click();
    $(withText("Issues")).click();
    $(withText("#1479")).should(Condition.exist);

    }
}
