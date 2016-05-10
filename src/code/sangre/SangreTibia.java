package code.sangre;
import code.top.AnimalVertebrado;
import code.lib.TipoReproduccion;

public abstract class SangreTibia extends AnimalVertebrado {
	// atributos
	protected String eliminExcesoCalor;
	
	protected SangreTibia(String tipoPiel, String tipoExtremidades,int numExtremidades, 
			String tipoAlimentacion, String tipoMobilidad, String nombre, 
			TipoReproduccion tipoReproduccion, String eliminExcesoCalor) {
		
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, 
				tipoMobilidad, nombre, tipoReproduccion);
		this.eliminExcesoCalor = eliminExcesoCalor;
	}
	
	// metodos
	abstract public void mostrarForma();	
	
	public void mostrarAnimalVertebrado() {
		super.mostrarAnimalVertebrado();
		System.out.println("\tELIMINA EXCESO DE CALOR CORPORAL POR: " + eliminExcesoCalor);
	}
}
