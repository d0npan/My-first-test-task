package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ActionsCardPage {
    public static void clickButtonDetails(String text) {

        $(By.xpath("//li/a[text()='" + text + "']")).click();
    }
}
