package co.com.sophos.retoautomatizacion.questions;

import co.com.sophos.retoautomatizacion.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ShoppingCart implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(ShoppingCartPage.ADDED_PRODUCTS_CARDS).viewedBy(actor).asString();
	}
	
	public static ShoppingCart containsTheProduct() {
        return new ShoppingCart();
    }
}
