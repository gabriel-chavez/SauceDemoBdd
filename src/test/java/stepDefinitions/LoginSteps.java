package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.DriverManager;

import java.util.List;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());
    @When("I set the user name text box with {string}")
    public void setUserName(String userName){
        loginPage.setUserNameTextBox(userName);
    }

    @When("I set the password text box with {string}")
    public void setPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @When("I click on the login button")
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }

    @Then("I verify that a error message that says {string} is displayed")
    public void verifyErrorMessageText(String errorText){
        loginPage.verifyErrorMessageText(errorText);
    }

    @And("I fill in the credentials with")
    public void fillCustomerInformation(DataTable customerData) {
        List<String> data = customerData.transpose().asList(String.class);
        loginPage.setUserNameTextBox(data.get(0));
        loginPage.setPasswordTextBox(data.get(1));
    }
}
