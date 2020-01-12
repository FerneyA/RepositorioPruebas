package co.com.sophos.retoautomatizacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/add_product_to_shopping_cart.feature",
		glue = "co.com.sophos.retoautomatizacion.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)
public class AddProductToShoppingCartRunner {}
