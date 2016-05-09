package code.sangre;
import code.top.Animal;

public abstract class SangreTibia extends Animal {
	// atributos
	protected String eliminExcesoCalor;
	
	// metodos
	abstract public void mostrarForma();
	
	SangreTibia(String tipoPiel, String tipoExtremidades,int numExtremidades, String tipoAlimentacion, String tipoMobilidad, String nombre, String tipoReproduccion, String eliminExcesoCalor) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad, nombre, tipoReproduccion);
		this.eliminExcesoCalor = eliminExcesoCalor;
	}
	
	public void mostrarAnimal() {
	super.mostrarAnimal();
	System.out.println("\tELIMINA EXCESO DE CALOR CORPORAL POR:" + eliminExcesoCalor);
	}
}
