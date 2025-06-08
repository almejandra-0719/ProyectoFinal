package com.co.Izyacademic.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Categorypage {


    public static final Target BTN_MENU_= Target.the("Text Menu")
            .locatedBy("//*[@class='fa-solid fa-bars']");


    public static final Target BTN_POSTS_= Target.the("Button Posts")
            .locatedBy("(//ul/li[@class='item'])[3]");

    public static final Target BTN_SELECTACTION = Target.the("Dropdown of selection Action")
            .locatedBy("//button[@class='accordion-button']");

    public static final Target TXT_CATEGORYNAME = Target.the("Text category name")
            .locatedBy("//input[@name='CategorieName']");

    public static final Target TXT_CATEGORYDESCRIPTION = Target.the("Text category description")
            .locatedBy("//input[@name='descriptionCategory']");

    public static final Target BTN_DIFFICULSELECT = Target.the("Button difficult select")
            .locatedBy("//input[@value='Difficult']");

    public static final Target BTN_CREAR = Target.the("Button crear")
            .locatedBy("//button[@id='effect-button']");
}
