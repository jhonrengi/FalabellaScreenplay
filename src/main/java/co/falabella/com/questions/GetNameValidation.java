package co.falabella.com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class GetName implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        String productSelName = GetName.get
        String productNameCart = GetCartItems.produtName();
        return productSelName.contains(productNameCart);
    }

    public static GetName from(){
        return new GetName() ;
    }
}
