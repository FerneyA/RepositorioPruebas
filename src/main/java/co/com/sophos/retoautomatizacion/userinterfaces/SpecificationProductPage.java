package co.com.sophos.retoautomatizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SpecificationProductPage {
	
	public static final Target ADD_PRODUCTO = Target.the("Add product button").located(By.id("ProductCard__add-to-cart"));
}
