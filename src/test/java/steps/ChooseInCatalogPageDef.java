package steps;

import io.cucumber.java.en.Then;
import pages.ChooseInCatalogPage;

public class ChooseInCatalogPageDef {
    ChooseInCatalogPage actionsCardPage = new ChooseInCatalogPage();

    @Then("Click {string} item")
    public void clickButtonDetails(String arg0) {
        actionsCardPage.clickButtonDetails(arg0);
    }
}
