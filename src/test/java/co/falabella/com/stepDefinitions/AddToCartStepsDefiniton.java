package co.falabella.com.stepDefinitions;

import co.falabella.com.interactions.GetCartItems;
import co.falabella.com.interactions.GetName;
import co.falabella.com.questions.GetNameValidation;
import co.falabella.com.questions.GetQuantityValidation;

import co.falabella.com.tasks.HomeTask;
import co.falabella.com.tasks.ProductDetailsTask;
import co.falabella.com.tasks.ProductTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddToCartStepsDefiniton {


    @Before
    public void setStage(){ setTheStage(new OnlineCast()); }
    @Given("that user open page Falabella and search any product")
    public void openUrl() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://www.falabella.com.co/falabella-co")
        );

    }
    @When("user click  on  product tittle and user click on add to cart")
    public void userClickOnProductTittleAndUserClickOnAddToCart() {
        theActorInTheSpotlight().attemptsTo(
                HomeTask.Home(),
                ProductTask.on(),
                GetName.name(),
                ProductDetailsTask.on(),
                GetCartItems.items()
                
        );

    }
    @Then("user can read the product added to cart and watch amount that product.")
    public void userCanReadTheProductAddedToCartAndWatchAmountThatProduct() {
            theActorInTheSpotlight().should(
                    seeThat(

                            GetNameValidation.from(), Matchers.equalTo(true)
                    ),
                    seeThat(GetQuantityValidation.from(), Matchers.equalTo(true))
            );
    }
}
