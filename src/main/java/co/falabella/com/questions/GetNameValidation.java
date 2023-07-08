package co.falabella.com.questions;

import co.falabella.com.interactions.GetCartItems;
import co.falabella.com.interactions.GetName;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class GetNameValidation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String productSelName = GetName.getNames(actor);
        String productNameCart = GetCartItems.produtName();
        return productSelName.contains(productNameCart);
    }

    public static Question<Boolean> from(){
        return new GetNameValidation() ;
    }
}
