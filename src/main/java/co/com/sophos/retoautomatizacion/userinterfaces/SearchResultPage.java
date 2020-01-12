package co.com.sophos.retoautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResultPage {
	
	public static final Target PRODUCT_SEARCHED = Target.the("product searched button")
			.locatedBy("//div[@id='search']//div[contains(@title, 'Bicicleta GOLIAT BM1679NGR Wascar Negro')]/parent::div/following-sibling::div/a");
}
