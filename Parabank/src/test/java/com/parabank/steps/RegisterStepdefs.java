import com.parabank.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegisterStepdefs {
    @Given("^User is on Home page$")
    public void userIsOnHomePage() {

    }

    @And("^click on the ‘Register’ link$")
    public void clickOnTheRegisterLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should login successfully and see \"([^\"]*)\"$")
    public void iShouldLoginSuccessfullyAndSee(String arg0) {

    }
}
