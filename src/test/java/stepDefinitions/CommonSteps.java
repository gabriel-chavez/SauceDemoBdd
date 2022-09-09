package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.DriverManager;

public class CommonSteps {

    @Given("I am in the Sauce Labs Demo Page")
    public void goToMainPage(){
        DriverManager.getInstance().getDriver().navigate("https://www.saucedemo.com/");
    }
}
