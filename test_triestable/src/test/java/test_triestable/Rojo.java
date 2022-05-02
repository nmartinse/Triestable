package test_triestable;

public class Rojo implements Estado {

	public void abrir(Triestable triestable) {
		triestable.setEstado(new Amarillo());
	}

	public void cerrar(Triestable triestable) {
		
	}

	public String estado(Triestable triestable) {
		return "cerrado";
	}
}

