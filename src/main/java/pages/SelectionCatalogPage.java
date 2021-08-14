package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class SelectionCatalogPage {
   public static void clickButtonProduct(String text) {

        $(By.xpath("//li/a[text()='" + text + "']")).click();
    }

}
