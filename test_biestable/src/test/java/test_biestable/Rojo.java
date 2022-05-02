package test_biestable;

public class Rojo implements Estado {

	public void abrir(Biestable biestable) {
		biestable.setEstado(new Verde());
	}

	public void cerrar(Biestable biestable) {
		
	}

	public String estado(Biestable biestable) {
		return "cerrado";
	}
}
