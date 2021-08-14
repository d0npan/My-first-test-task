package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class ChooseInCatalogPage {
    public static void clickButtonDetails(String text) {

        $(By.xpath("//img[@alt='" + text + "']")).click();
    }


}
