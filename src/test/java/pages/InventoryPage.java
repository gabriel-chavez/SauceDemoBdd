package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class InventoryPage {
    private Page driver;
    private Locator addCart;
    public InventoryPage(Page driver){
        this.driver = driver;
        this.addCart = driver.locator("button.btn_inventory");
    }
    public void clickOnAddToCart(){
        this.addCart.click();
    }
    public void verifyProductInInventory(String product){
        Assert.assertTrue(driver.isVisible("//div[text()='"+product+"']"));
    }
}
