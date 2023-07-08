package co.falabella.com.tasks;


import co.falabella.com.ui.ProductUI;
import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductDetailsTask implements Task {
    Excel excel = new Excel();




    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            actor.attemptsTo(
                        Scroll.to(ProductUI.CBX_QUANTITIES),
                        Clear.field("//input[@id='quantity-selector-increment-input']"),


                        Enter.theValue(" ").into(ProductUI.CBX_QUANTITIES).thenHit(Keys.ENTER),
                        Enter.theValue(excel.leerDatosExcel("Data.xlsx","Search",1,1)).into(ProductUI.CBX_QUANTITIES).thenHit(Keys.ENTER),
                        Click.on(ProductUI.BTN_BUY),
                        Click.on(ProductUI.BTN_GOTOCART)




                );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Performable on(){
        return instrumented(ProductDetailsTask.class);
    }
}
