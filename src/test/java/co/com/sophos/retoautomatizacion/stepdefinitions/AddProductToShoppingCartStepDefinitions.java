package co.com.sophos.retoautomatizacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.sophos.retoautomatizacion.questions.ShoppingCart;
import co.com.sophos.retoautomatizacion.tasks.AddTheProduct;
import co.com.sophos.retoautomatizacion.tasks.OpenTheApplication;
import co.com.sophos.retoautomatizacion.tasks.Search;
import co.com.sophos.retoautomatizacion.userinterfaces.PlazaveaHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AddProductToShoppingCartStepDefinitions {
	
	private Actor peter = Actor.named("Peter");
	
	PlazaveaHomePage plazaveaHomePage;
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	@Before
	public void peterCanBrowseTheWeb() {
		peter.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Peter wants to find the product (.*)$")
	public void thatPeterWantsToFindTheProduct(String nameProduct) throws Exception {
		peter.wasAbleTo(OpenTheApplication.on(plazaveaHomePage), Search.theProduct(nameProduct));
	}

	@When("^he adds the product to the shopping cart$")
	public void heAddsTheProductToTheShoppingCart() throws Exception {
		peter.attemptsTo(AddTheProduct.toTheShoppingCart());
	}

	@Then("^the product (.*) should be added to the shopping cart successfully$")
	public void theProductShouldBeAddedToTheShoppingCartsuccessfully(String nameProduct) throws Exception {
		 peter.should(seeThat(ShoppingCart.containsTheProduct(), Matchers.containsString(nameProduct)));
	}
}
