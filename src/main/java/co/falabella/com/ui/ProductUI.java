package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductUI {




    public static final Target CBX_QUANTITIES = Target.the("Combo box quantities")
            .located(By.xpath("//input[@id='quantity-selector-increment-input']"));

    public static final Target BTN_BUY = Target.the("Button Buy")
            .located(By.xpath("//button[@id='add-to-cart-button']"));

    public static final Target BTN_GOTOCART = Target.the("Go to cart")
            .located(By.xpath("//a[@id='linkButton']"));
    public static Target LBL_PRODUCT = Target.the("Product label")
            .locatedBy("//div[contains(@class, 'jsx-1442607798')]");


}
