
public class Verde implements Estado {

	public void cerrar(Object o) {
		if (o instanceof Triestable)
			((Triestable) o).setEstado(new Amarillo());
		else
			((Biestable) o).setEstado(new Rojo());

	}

	public void abrir(Object o) {

	}

	public String estado(Object o) {
		return "abierto";
	}
}

