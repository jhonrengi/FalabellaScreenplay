package co.falabella.com.tasks;

import co.falabella.com.interactions.ClickRamdom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    ClickRamdom.click()
            );
    }

    public static Performable on(){
        return instrumented(ProductTask.class);
    }
}
