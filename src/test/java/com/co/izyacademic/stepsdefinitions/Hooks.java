package com.co.izyacademic.stepsdefinitions;

import com.co.Izyacademic.models.Datauser;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

import java.util.Map;

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

    @DataTableType
    public Datauser datauserEntry(Map<String,String> entry){
        return new Datauser(entry.get("name"),entry.get("username"), entry.get("country"),entry.get("city"),entry.get("idnumber"),entry.get("phone"),entry.get("email"), entry.get("password") );


    }
}
