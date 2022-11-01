package tests.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {

    @When("^I visit (.*) site$")
    public void I_visit_xxx_site(String siteName) {
        open(siteName);
    }

    @Then("I should see logo on the login page")
    public void iShouldSeeLogoOnTheLoginPage() {
        LoginPage loginPage = new LoginPage();
        $(loginPage.logoFieldLocator).shouldHave(Condition.visible);
    }
}
