package steps;

import io.cucumber.java.en.Then;
import pages.ActionsCardPage;

public class ActionsCardPageDef {
    ActionsCardPage actionsCardPage = new ActionsCardPage();

    @Then("Click {string} reference")
    public void clickButtonDetails(String arg0) {
        actionsCardPage.clickButtonDetails(arg0);
    }
}
