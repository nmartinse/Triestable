
public class Sistema {

	private Tipo t = new Biestable();

	public void cambio() {
		if (t instanceof Biestable) {
			t = new Triestable();
			t.setEstado(new Amarillo());
		} else
			t = new Biestable();
	}

	public void abrir() {
		t.abrir();
	}

	public void cerrar() {
		t.cerrar();
	}

	public String t() {
		return t.estado();
	}

	public void setEstado(Estado e) {
		t.setEstado(e);

	}

	public String estado() {
		return t.estado();
	}
}

