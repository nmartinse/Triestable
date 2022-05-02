package test_triestable;

public class Verde implements Estado {

	public void abrir(Triestable triestable) {
		
	}

	public void cerrar(Triestable triestable) {
		triestable.setEstado(new Amarillo());
	}

	public String estado(Triestable triestable) {
		return "abierto";
	}
}

