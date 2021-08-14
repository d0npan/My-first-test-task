
package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {
    public void clickButton(String text) {

        $(By.xpath("//li/span[text()='" + text + "']")).click();
    }
    public void clickA(String text) {

        $(By.xpath("//li/span/a[text()='" + text + "']")).click();
    }
}

