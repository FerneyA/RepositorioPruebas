package co.com.sophos.retoautomatizacion.tasks;

import co.com.sophos.retoautomatizacion.userinterfaces.PlazaveaAppsComponent;
import co.com.sophos.retoautomatizacion.userinterfaces.SearchResultPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Search implements Task {
	
	private String nameProduct;
	
	public Search(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	@Step("{0} looks for the product '#itemName'")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(nameProduct).into(PlazaveaAppsComponent.PLAZAVEA_SEARCH),
				Click.on(SearchResultPage.PRODUCT_SEARCHED));
	}

	public static Search theProduct(String nameProduct) {
		return Instrumented.instanceOf(Search.class).withProperties(nameProduct);
	}
}