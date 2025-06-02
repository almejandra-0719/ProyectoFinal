package com.co.izyacademic.stepsdefinitions;

import com.co.Izyacademic.models.Datauser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.model.util.EnvironmentVariables;

import java.util.List;

public class RegistrationStepDefinition {

    EnvironmentVariables environmentVariables;

    @Given("user is in registration page")
    public void userIsInRegistrationPage() {
        String webServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("environments.default.webdriver.base.url");
        String URL = webServiceEndpoint.toString();
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }
    @When("user enters valid registration data")
    public void userEntersValidRegistrationData(List<Datauser> datauserList) {
        Datauser datauser;
        datauser=datauserList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo();

    }
    @Then("user should be redirected to the main page")
    public void userShouldBeRedirectedToTheMainPage() {

    }
    @Then("user should be able to create a new category for a course")
    public void userShouldBeAbleToCreateANewCategoryForACourse() {

    }
}
