package steps;

import io.cucumber.java.en.Then;
import pages.ActionsBasketPage;

public class ActionsBasketPageDef {

    ActionsBasketPage actionsBasketPage = new ActionsBasketPage();

   @Then("Click {string} menu")

   public void openBasketMenu(String arg5) {actionsBasketPage.openBasketMenu(arg5);
   }


}
