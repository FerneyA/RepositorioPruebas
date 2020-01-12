package co.com.sophos.retoautomatizacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.sophos.retoautomatizacion.userinterfaces.ShoppingCartPage;
import co.com.sophos.retoautomatizacion.userinterfaces.SpecificationProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddTheProduct implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SpecificationProductPage.ADD_PRODUCTO),
				Click.on(ShoppingCartPage.SHOPPING_CART_ICON));
	}
	
	public static AddTheProduct toTheShoppingCart() {
		return instrumented(AddTheProduct.class);
	}
}