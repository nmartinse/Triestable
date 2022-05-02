
public class Verde implements Estado {

	public void abrir(Biestable biestable) {
		
	}

	public void cerrar(Biestable biestable) {
		biestable.setEstado(new Rojo());
		
	}

	public String estado(Biestable biestable) {
		return "abierto";
	}
}

