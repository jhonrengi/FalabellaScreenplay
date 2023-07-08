package co.falabella.com;

import net.serenitybdd.screenplay.targets.Target;

public class ui {
    public static Target TXT_SEARCH = Target.the("Textbox search flex")
            .locatedBy("//input[@id='testId-SearchBar-Input']");
}
