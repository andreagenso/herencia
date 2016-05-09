package code.clasificacion;
import code.sangre.*;

public abstract class Anfibio extends SangreFria {
	
	// atributos
	protected String estadoMetamorfosis;
	
	// metodos
	abstract public void mostrarForma();
	
	protected Anfibio(String tipoPiel, String tipoExtremidades, int numExtremidades, String tipoAlimentacion, String tipoMobilidad, String nombre, String tipoReproduccion, double tempCuerpoActual, double tempAmbiente, String estadoMetamorfosis) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad, nombre, tipoReproduccion, tempCuerpoActual, tempAmbiente);
		this.estadoMetamorfosis = estadoMetamorfosis;
	}
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/ANFIBIO"); 
	}	
	
	public void mostrarAnimal() {
		super.mostrarAnimal();
		System.out.println("\tESTADO DE METAMORFOSIS: " + estadoMetamorfosis);
	}
}