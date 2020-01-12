package co.com.sophos.retoautomatizacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheApplication implements Task {
	
	private PageObject page;
	
	public OpenTheApplication(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} opens the browser on Plazavea Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}

	public static OpenTheApplication on(PageObject page) {
		return instrumented(OpenTheApplication.class, page);
	}
}