package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.DriverManager;

public class HomeSteps {
    private HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());

    @Then("I am in the home page")
    @Then("I should be in the home page")
    public void verifyImInHomePage(){
        homePage.verifyHomePageHeaderIsDisplayed();
    }

    @Then("I verify that {string} is displayed")
    public void verifyProductInHomePage(String product){
        homePage.verifyProductInHomePage(product);
    }

    @Then("I add sauce labs back pack product to the cart")
    public void addSauceLabsBackPackToCart(){
        homePage.clickOnAddSauceLabsBackPack();
    }
    @Then("I add {string} product to the cart")
    public void addSauceLabsBackPackToCart(String product){
        homePage.clickOnAddSauceLabsBackPack();
    }
    @And("I click on the cart icon")
    public void clickOnCartIcon(){
        homePage.clickOnCartIcon();
    }

    @Then("I click {string} product")
    public void clickOnProduct(String product){
        homePage.clickOnProduct(product);
    }
    @Then("I check the quantity of products in de cart")
    public void checkQuantityProductCart(){
        homePage.checkQuantityProductCart();
    }
    @Then("I verify that product is added")
    public void verifyProductIsAdded(){
        homePage.verifyProductIsAdded();
    }
}
