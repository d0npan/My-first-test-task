package steps;


import io.cucumber.java.en.Then;
import pages.SelectionCatalogPage;

public class SelectionCatalogPageDef {
    SelectionCatalogPage selectionCatalogPage = new SelectionCatalogPage();

    @Then("Click {string} item")
    public void clickButtonProduct(String arg0) {
        selectionCatalogPage.clickButtonProduct(arg0);
    }
}
