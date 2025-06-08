package com.co.Izyacademic.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPage {

    public static final Target BTN_MENU_= Target.the("Text Menu")
            .locatedBy("//*[@class='fa-solid fa-bars']");

    public static final Target BTN_REGISTER_= Target.the("Text Register")
            .locatedBy("//*[@id='Register']");

    public static final Target TXT_NAME_= Target.the("Text Name")
            .locatedBy("(//input[@id='exampleInputEmail1'])[1]");

    public static final Target TXT_USERNAME_= Target.the("Text Username")
            .locatedBy("(//input[@id='exampleInputEmail1'])[2]");

    public static final Target BTN_COUNTRY_= Target.the("Button Country")
            .locatedBy("//select[@id='exampleInputEmail1']");

    public static final Target TXT_CITY_= Target.the("Text City")
            .locatedBy("(//input[@id='exampleInputEmail1'])[3]");

    public static final Target TXT_IDNUMBER_= Target.the("Text identification number")
            .locatedBy("(//input[@id='exampleInputEmail1'])[4]");

    public static final Target TXT_PHONE_= Target.the("Text Phone")
            .locatedBy("(//input[@id='exampleInputEmail1'])[5]");

    public static final Target TXT_EMAILADDRESS_= Target.the("Text Email address")
            .locatedBy("//input[@id='email']");

    public static final Target TXT_PASSWORD_= Target.the("Text Password")
            .locatedBy("//input[@id='password']");

    public static final Target TXT_PASSWORDCONFIRM_= Target.the("Confirm Text Password")
            .locatedBy("//input[@id='password-confirm']");

    public static final Target BTN_REGISTERFORM_= Target.the("Button Register form")
            .locatedBy("//button[@id='effect-button']");

    public static final Target TXT_POTENT_= Target.the("Text potent")
            .locatedBy("//h4[@class='mb-3 fs-4 delay-elements']");



}
