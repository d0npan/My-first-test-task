package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class SelectionCatalogPage {
  public static void clickButtonAddBasket(String text) {

        $(By.xpath("//div[@id='" + text + "']")).click();

  }
    public static void clickButtonGoBasket(String text) {

        $(By.xpath("//i[@class='" + text + "']")).click();

    }
}
