
public class Amarillo implements Estado {

	public void abrir(Object o) {
		if (o instanceof Triestable)
			((Triestable) o).setEstado(new Verde());

	}

	public void cerrar(Object o) {
		if (o instanceof Triestable)
			((Triestable) o).setEstado(new Rojo());

	}

	public String estado(Object o) {
		return "preucacion";
	}
}

