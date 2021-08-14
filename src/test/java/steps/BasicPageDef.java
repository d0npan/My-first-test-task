package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg0)  {
        basicPage.clickButton(arg0);
    }

    @Then("Click {string} sub_button")
    public void clickA(String arg0)  {
        basicPage.clickA(arg0);
    }

}
