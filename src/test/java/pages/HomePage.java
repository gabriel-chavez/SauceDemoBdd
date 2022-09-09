package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class HomePage {
    private Page driver;
    private Locator header;
    private Locator sauceLabsBackPackAddButton;
    private Locator cartIcon;
    private int CantProductCart=0;

    public HomePage(Page driver){
        this.driver = driver;
        this.header = driver.locator("div.header_label");
        this.sauceLabsBackPackAddButton = driver.locator("id=add-to-cart-sauce-labs-backpack");
        cartIcon = driver.locator("a.shopping_cart_link");
    }

    public void verifyHomePageHeaderIsDisplayed(){
        Assert.assertTrue(header.isVisible());
    }

    public void verifyProductInHomePage(String product){
        Assert.assertTrue(driver.isVisible("//div[text()='"+product+"']"));
    }

    public void clickOnAddSauceLabsBackPack(){
        sauceLabsBackPackAddButton.click();
    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }
    public void clickOnProduct(String product){
        Locator productAdd=driver.locator("//div[text()='"+product+"']");
        productAdd.click();
    }
    public void checkQuantityProductCart(){
        System.out.println(this.CantProductCart);
        if(driver.isVisible("span.shopping_cart_badge"))
        {
            this.CantProductCart = Integer.parseInt(driver.innerText("span.shopping_cart_badge"));
        }else{
            this.CantProductCart=0;
        }
    }
    public void verifyProductIsAdded(){
        int cantProductAdded=0;
        if(driver.isVisible("span.shopping_cart_badge"))
        {
            cantProductAdded = Integer.parseInt(driver.innerText("span.shopping_cart_badge"));
        }

        Assert.assertTrue( cantProductAdded==this.CantProductCart+1);
    }
}
