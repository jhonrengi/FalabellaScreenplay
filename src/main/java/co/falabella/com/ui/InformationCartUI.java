package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InformationCartUI {

    public static Target TXT_INFORMATION = Target.the("Textbox search flex")
            .locatedBy("//p[@data-testid='name']");


    public static Target TXT_INFORMATION1 = Target.the("Textbox search flex")
            .locatedBy("//div[contains(@class, 'jsx-1442607798 product-name fa--product-name false')]");



}
