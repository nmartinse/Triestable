package test_biestable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
	private Biestable b = new Biestable();

	@Given("el biestable en estado Verde")
	public void el_biestable_en_estado_verde() {
		b.setEstado(new Verde());
	}

	@When("quiero seleccionar abrir")
	public void quiero_seleccionar_abrir() {
		b.abrir();
	}

	@Then("no se modifica el estado")
	public void no_se_modifica_el_estado() {
		assertEquals("abierto", b.estado());
	}

	@Given("el biestable esta en Verde")
	public void el_biestable_esta_en_verde() {
		b.setEstado(new Verde());
	}

	@When("quiero seleccionar cerrar")
	public void quiero_seleccionar_cerrar() {
		b.cerrar();
	}

	@Then("se modifica el estado a rojo")
	public void se_modifica_el_estado_a_rojo() {
		assertEquals("cerrado", b.estado());
	}

	@Given("el biestable en estado rojo")
	public void el_biestable_en_estado_rojo() {
		b.setEstado(new Rojo());
	}

	@When("selecciono abrir")
	public void selecciono_abrir() {
		b.abrir();
	}

	@Then("se modifica el estado a verde")
	public void se_modifica_el_estado_a_verde() {
		assertEquals("abierto", b.estado());
	}

	@Given("el biestable esta en rojo")
	public void el_biestable_esta_en_rojo() {
		b.setEstado(new Rojo());
	}

	@When("slecciono cerrar")
	public void slecciono_cerrar() {
		b.cerrar();
	}

	@Then("el estado no se modifica")
	public void el_estado_no_se_modifica() {
		assertEquals("cerrado", b.estado());
	}

}
