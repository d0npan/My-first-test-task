package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ActionsBasketPage {

    public void equalsPrices(String text){
        SelenideElement prices =
                $(By.xpath("//div[@class='kbb_basket__price'][@data-price='2990.00']"));
        prices.shouldBe(text("" + text + ""));
    }


    public void equalsName(String text){
            SelenideElement name =
                    $(By.xpath("//div[@class=\"kkb_basket__item-title\"]/a[@target=\"_blank\"]"));
            name.shouldHave(text("" + text + ""));
        }
}


