package co.falabella.com.questions;

import co.falabella.com.interactions.GetCartItems;
import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;

public class GetQuantityValidation implements Question <Boolean> {
    Excel excel = new Excel();




    @Override
    public Boolean answeredBy(Actor actor) {

        String Quantity = null;
        try {
            Quantity = excel.leerDatosExcel("Data.xlsx","Search",1,1);
            String QuantityCart = GetCartItems.productQtyCart();
            return Quantity.equals(QuantityCart);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Question <Boolean> from()  { return new GetQuantityValidation(); }
}
