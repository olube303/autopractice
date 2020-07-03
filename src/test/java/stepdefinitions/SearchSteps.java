package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchPage;
import utilities.WebDriverHelpers;

public class SearchSteps{

    private final WebDriverHelpers webDriverHelpers;
    private final SearchPage searchPage;


    public SearchSteps(WebDriverHelpers driverHelpers, SearchPage searchPage){
        this.webDriverHelpers = driverHelpers;

        this.searchPage = searchPage;
    }

    @Given("^I launch the automation practice on chrome browser$")
    public void loadApplication() {

    }

    @And("^I click on sign in$")
    public void iClickOnSignIn()throws Throwable{
        searchPage.clickOnSignInLink();

    }

    @When("^I enter my email address \"([^\"]*)\"$")
    public void iEnterMyEmailAddress(String email) throws Throwable {
    }

    @And("^my password successfully \"([^\"]*)\"$")
    public void myPasswordSuccessfully(String password) throws Throwable {
    }

    @Then("^i am successfully logged into the website$")
    public void iAmSuccessfullyLoggedIntoTheWebsite() {

    }

    @And("^Account message is displayed in the home page$")
    public void accountMessageIsDisplayedInTheHomePage() {
    }
}
