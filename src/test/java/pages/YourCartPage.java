package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class YourCartPage {
    private Page driver;
    private Locator checkoutButton;
    private Locator removeButton;
    public YourCartPage(Page driver){
        this.driver = driver;
        this.checkoutButton = driver.locator("id=checkout");
        this.removeButton = driver.locator("button.cart_button");
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }
    public void clickOnRemoveButton(){
        removeButton.click();
    }
    public void verifyProductNotIsDisplayed(String product){

        Assert.assertTrue(!driver.isVisible("//div[text()='"+product+"']"));
    }
}
