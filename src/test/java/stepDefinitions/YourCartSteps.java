package stepDefinitions;

import io.cucumber.java.en.And;
import pages.YourCartPage;
import utilities.DriverManager;

public class YourCartSteps {
    YourCartPage yourCartPage = new YourCartPage(DriverManager.getInstance().getDriver());
    @And("I click on checkout button")
    public void clickOnCheckoutButton(){
       yourCartPage.clickOnCheckoutButton();
    }
    @And("I click on the remove button")
    public void clickOnRemoveButton(){yourCartPage.clickOnRemoveButton();}
    @And("I verify that product {string} removed")
    public void verifyProductNotIsDisplayed(String product){
        yourCartPage.verifyProductNotIsDisplayed(product);
    }
}
