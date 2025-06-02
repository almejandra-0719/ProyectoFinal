package com.co.izyacademic.stepsdefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Userizy");
        OnStage.theActorInTheSpotlight().can(BrowsingTheWeb.with(hisBrowser));
    }
}
