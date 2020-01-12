package co.com.sophos.retoautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {
	
	public static final Target SHOPPING_CART_ICON = Target.the("Shopping cart icon")
			.locatedBy("//div[@class='cart__ico']");
	public static final Target ADDED_PRODUCTS_CARDS = Target.the("Added products cards")
			.locatedBy("//div[@class='minicart__card is-un']");
}
