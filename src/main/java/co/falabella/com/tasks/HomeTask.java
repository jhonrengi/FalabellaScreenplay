package co.falabella.com.tasks;

import co.falabella.com.ui.HomeUI;
import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {

    Excel excel = new Excel();
    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            actor.attemptsTo(
                    Click.on(HomeUI.TXT_SEARCH),
                    Enter.theValue(excel.leerDatosExcel("Data.xlsx","Search",1,0)).into(HomeUI.TXT_SEARCH).thenHit(Keys.ENTER)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Performable Home(){
        return instrumented(HomeTask.class);
    }
}
