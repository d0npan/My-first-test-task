package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ActionsBasketPage {

    public static void openBasketMenu(String text) {

        $($$(By.xpath("//div/a[@target=\"_blank\"]")).findBy(Condition.exactText("Машина р/у 1:10 Краулер MZ 2837 +акб"))).
                shouldHave(Condition.exactText("" + text + "")).click();
    }
}
// assertThat($$(By.target("_blank")).findBy(Condition.exactText("" + text + "")).getText(), equalTo("Страховые полисы");
// $(By.xpath("//i[@class='" + text + "']")).click();
//$$(By.xpath("//div/a[@target="_blank"]")).findBy(Condition.exactText("Машина р/у 1:10 Краулер MZ 2837 +акб"));
//$$(By.target("_blank")).findBy(Condition.exactText("" + text + "")).click();


