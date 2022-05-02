/**
 * 
 * @author Nerea
 *
 */

public class Biestable {

	private Estado estado;

	/**
	 * Método set, para cambiar de estado
	 * 
	 * @param e: estado al que se desea cambiar
	 */
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

