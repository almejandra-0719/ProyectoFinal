package com.co.Izyacademic.tasks;

import com.co.Izyacademic.models.Datauser;
import com.co.Izyacademic.userinterfaces.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Registration implements Task {

    public Registration(Datauser datauser) {
        this.datauser = datauser;
    }

    Datauser datauser;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistrationPage.BTN_MENU_),
                Click.on(RegistrationPage.BTN_REGISTER_),
                Enter.theValue(datauser.getName()).into(RegistrationPage.TXT_NAME_),
                Enter.theValue(datauser.getUsername()).into(RegistrationPage.TXT_USERNAME_)
        );
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datauser.getCountry()).from(RegistrationPage.BTN_COUNTRY_),
                Enter.theValue(datauser.getCity()).into(RegistrationPage.TXT_CITY_),
                Enter.theValue(datauser.getIdnumber()).into(RegistrationPage.TXT_IDNUMBER_),
                Enter.theValue(datauser.getPhone()).into(RegistrationPage.TXT_PHONE_),
                Enter.theValue(datauser.getEmail()).into(RegistrationPage.TXT_EMAILADDRESS_),
                Enter.theValue(datauser.getPassword()).into(RegistrationPage.TXT_PASSWORD_),
                Enter.theValue(datauser.getPassword()).into(RegistrationPage.TXT_PASSWORDCONFIRM_));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Click.on(RegistrationPage.BTN_REGISTERFORM_));






    }

    public static Registration enter(Datauser datauser) {
        return Tasks.instrumented(Registration.class, datauser);
    }
}
