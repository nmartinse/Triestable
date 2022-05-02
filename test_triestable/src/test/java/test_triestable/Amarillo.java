package test_triestable;

public class Amarillo implements Estado {

	public void abrir(Triestable triestable) {
		triestable.setEstado(new Verde());
	}

	public void cerrar(Triestable triestable) {
		triestable.setEstado(new Rojo());
	}

	public String estado(Triestable triestable) {
		return "preucacion";
	}
}

