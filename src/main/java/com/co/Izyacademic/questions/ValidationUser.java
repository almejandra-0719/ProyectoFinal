package com.co.Izyacademic.questions;

import com.co.Izyacademic.userinterfaces.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationUser implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RegistrationPage.TXT_POTENT_).answeredBy(actor);
    }

    public static ValidationUser compare(){
        return new ValidationUser();
    }

}
