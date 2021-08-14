package steps;


import io.cucumber.java.en.Then;
import pages.SelectionCatalogPage;

public class SelectionCatalogPageDef {
    SelectionCatalogPage selectionCatalogPage = new SelectionCatalogPage();

    @Then("Click {string} basket_button")
    public void clickButtonAddBasket(String arg0) {
        selectionCatalogPage.clickButtonAddBasket(arg0);
    }

    @Then("Click {string} go_basket_button")
    public void clickButtonGoBasket(String arg0) {
        selectionCatalogPage.clickButtonGoBasket(arg0);
    }

}
