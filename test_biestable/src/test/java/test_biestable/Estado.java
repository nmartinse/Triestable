package test_biestable;

public interface Estado {

	void abrir(Biestable biestable);
	void cerrar(Biestable biestable);
	String estado(Biestable biestable);

}
