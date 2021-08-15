package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SelectionCatalogPage {
  public static void clickButtonAddBasket(String text) {

      $(byText("" + text + "")).click();

  }

    public static void clickButtonGoBasket(String text) {

      $$(By.id("itc_in_basket_card")).findBy(Condition.exactText("" + text + "")).click();
    }
}
