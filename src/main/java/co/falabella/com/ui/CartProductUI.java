package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartProductUI {



    public static Target QTY_PRODUCT = Target.the("Product label")
            .locatedBy("//input[@class='chakra-input css-1hzo6s2']");

    public static Target TXT_PRODUCTNAME = Target.the("Product label")
            .locatedBy("//p[@data-testid='name']");
}
