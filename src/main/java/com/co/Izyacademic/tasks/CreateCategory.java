package com.co.Izyacademic.tasks;

import com.co.Izyacademic.userinterfaces.Categorypage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CreateCategory implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(Categorypage.BTN_MENU_),
                Click.on(Categorypage.BTN_POSTS_),

                SelectFromOptions.byVisibleText("Create Category").from(Categorypage.BTN_SELECTACTION),
                Enter.theValue("Automatización Pruebas Screenplay").into(Categorypage.TXT_CATEGORYNAME),
                Enter.theValue("Cursos Automatización").into(Categorypage.TXT_CATEGORYDESCRIPTION),
                Click.on(Categorypage.BTN_DIFFICULSELECT),
                Click.on(Categorypage.BTN_CREAR)
        );
    }

    public static Registration enter() {
        return Tasks.instrumented(Registration.class);
    }
}
