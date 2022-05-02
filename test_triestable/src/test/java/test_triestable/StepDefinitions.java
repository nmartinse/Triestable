package test_triestable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	
	private Triestable t = new Triestable();
	
	@Given("el triestable en estado Amarillo")
	public void el_triestable_en_estado_amarillo() {
	    t.setEstado(new Amarillo());
	}
	@When("invoco al metodo abrir")
	public void invoco_al_metodo_abrir() {
	    t.abrir();
	}
	@Then("se modifica el estado a Verde")
	public void se_modifica_el_estado_a_verde() {
		assertEquals("abierto", t.estado());
	}

	
	@Given("el triestable esta en Amarillo")
	public void el_triestable_esta_en_amarillo() {
	    t.setEstado(new Amarillo());
	}
	@When("invoco al metodo cerrar")
	public void invoco_al_metodo_cerrar() {
	   t.cerrar();
	}
	@Then("se modifica el estado a Rojo")
	public void se_modifica_el_estado_a_rojo() {
		assertEquals("cerrado", t.estado());
	}


	@Given("el triestable en estado rojo")
	public void el_triestable_en_estado_rojo() {
	    t.setEstado(new Rojo());
	}
	@When("selecciono abrir")
	public void selecciono_abrir() {
	    t.abrir();
	}
	@Then("se modifica el estado a amarillo")
	public void se_modifica_el_estado_a_amarillo() {
		assertEquals("preucacion", t.estado());
	}


	@Given("el triestable esta en rojo")
	public void el_triestable_esta_en_rojo() {
	    t.setEstado(new Rojo());
	}
	@When("slecciono cerrar")
	public void slecciono_cerrar() {
	    t.cerrar();
	}
	@Then("el estado no se modifica")
	public void el_estado_no_se_modifica() {
		assertEquals("cerrado", t.estado());
	}

	
	@Given("el triestable en estado Verde")
	public void el_triestable_en_estado_verde() {
	    t.setEstado(new Verde());
	}
	@When("quiero seleccionar abrir")
	public void quiero_seleccionar_abrir() {
	   t.abrir();
	}
	@Then("no se modifica el estado")
	public void no_se_modifica_el_estado() {
		assertEquals("abierto", t.estado());
	}

	
	@Given("el triestable esta en Verde")
	public void el_triestable_esta_en_verde() {
	   t.setEstado(new Verde());
	}
	@When("quiero seleccionar cerrar")
	public void quiero_seleccionar_cerrar() {
	    t.cerrar();
	}
	@Then("se modifica al estado amarillo")
	public void se_modifica_al_estado_a_amarillo() {
		assertEquals("preucacion", t.estado());
	}
}


