package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ActionsBasketPage {

        public void equalsPrice(String text){
            SelenideElement price =
                    $(By.xpath("//div[@class='kbb_basket__price']")).find(byText("2 990 ₽")); //[text()='2 990 ₽']
            price.shouldBe(text("" + text + ""));
        }
        public void equalsName(String text){
            SelenideElement name =
                    $(By.xpath("//div/a[@target='_blank'][text()='Машина р/у 1:10 Краулер MZ 2837 +акб']"));
            name.shouldHave(text("" + text + ""));
        }
}



