
package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {
    public void clickButton(String text) {

        $(By.xpath("//button[@aria-label='" + text + "']")).click();
    }
    public void clickButton1(String text) {

        $(By.xpath("//a[text()='" + text + "']")).click();
    }
}

