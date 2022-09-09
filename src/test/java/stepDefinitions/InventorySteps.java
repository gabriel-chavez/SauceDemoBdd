package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.InventoryPage;
import utilities.DriverManager;

public class InventorySteps {
    private InventoryPage inventoryPage = new InventoryPage(DriverManager.getInstance().getDriver());
    @Then("I click on add to cart")
    public void clickOnAddToCart(){
        inventoryPage.clickOnAddToCart();
    }
    @Then("I verify that product {string} is added")
    public void verifyProductInInventory(String product){
        inventoryPage.verifyProductInInventory(product);
    }
}
