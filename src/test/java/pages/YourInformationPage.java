package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class YourInformationPage {
    private Page driver;
    private Locator nameTextBox;
    private Locator lastNameTextBox;
    private Locator zipCodeTextBox;
    private Locator continueButton;
    private Locator errorButton;
    public YourInformationPage(Page driver){
        this.driver = driver;
        this.nameTextBox = driver.locator("id=first-name");
        this.lastNameTextBox = driver.locator("id=last-name");
        this.zipCodeTextBox = driver.locator("id=postal-code");
        this.continueButton = driver.locator("id=continue");
        this.errorButton=driver.locator("button.error-button");
    }
    public void setNameTextBox(String name){
        nameTextBox.type(name);
    }
    public void setLastNameTextBox(String lastName){
        lastNameTextBox.type(lastName);
    }
    public void setZipCodeTextBox(String zipCode){
        zipCodeTextBox.type(zipCode);
    }
    public void clickOnContinueButton(){
        continueButton.click();
    }
    public void verifyErrorDisplayed(String error){

        Assert.assertTrue(driver.isVisible("//h3[text()='"+error+"']"));
    }
}
