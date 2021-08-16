package steps;
import io.cucumber.java.en.Then;
import pages.ActionsBasketPage;

public class ActionsBasketPageDef {

    ActionsBasketPage actionsBasketPage = new ActionsBasketPage();

    @Then("Price product should be {string}") //(?₽)
    public void equalsPrices(String arg5){
        actionsBasketPage.equalsPrices(arg5);

    }

    @Then("Name product should be {string}")
    public void equalsName(String arg6){
        actionsBasketPage.equalsName(arg6);
    }

}
