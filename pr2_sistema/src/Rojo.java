
public class Rojo implements Estado {

	public void abrir(Object o) {
		if (o instanceof Triestable)
			((Triestable) o).setEstado(new Amarillo());
		else
			((Biestable) o).setEstado(new Verde());

	}

	public void cerrar(Object o) {

	}

	public String estado(Object o) {
		return "cerrado";
	}
}

