package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Нажмем на кнопку {string}")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }
    @Then("Нажмем на кнопку {string}")
    public void clickButton1(String arg1) {
        basicPage.clickButton(arg1);
    }
}
