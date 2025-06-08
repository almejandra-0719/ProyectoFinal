package com.co.Izyacademic.questions;

import com.co.Izyacademic.userinterfaces.Categorypage;
import com.co.Izyacademic.userinterfaces.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationCategory implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(Categorypage.TXT_CATEGORYCONFIRM_).answeredBy(actor);
    }

    public static ValidationCategory compare(){
        return new ValidationCategory();
    }
}
