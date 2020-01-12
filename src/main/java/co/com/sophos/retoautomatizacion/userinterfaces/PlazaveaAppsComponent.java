package co.com.sophos.retoautomatizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PlazaveaAppsComponent {
	
	public static final Target PLAZAVEA_SEARCH = Target.the("Plazavea button search")
			.located(By.id("search_box"));
}
