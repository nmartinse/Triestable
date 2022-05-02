/**
 * 
 * @author Nerea
 *
 */

public class Biestable implements Tipo {

	private Estado estado;

	public void setEstado(Estado e) {
		estado = e;
	}

	public void abrir() {
		estado.abrir(this);
	}

	public void cerrar() {
		estado.cerrar(this);
	}

	public String estado() {
		return estado.estado(this);
	}
}

