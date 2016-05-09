package code.clasificacion;

import code.sangre.*;
import code.lib.EstadoMetamorfosis;
import code.lib.TipoReproduccion;

public abstract class Anfibio extends SangreFria {
	
	// atributos
	protected EstadoMetamorfosis estadoMetamorfosis;
	
	protected Anfibio(String tipoPiel, String tipoExtremidades, int numExtremidades,
			String tipoAlimentacion, String tipoMobilidad, String nombre, 
			TipoReproduccion tipoReproduccion, double tempCuerpoActual, double tempAmbiente, 
			EstadoMetamorfosis estadoMetamorfosis) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad,
				nombre, tipoReproduccion, tempCuerpoActual, tempAmbiente);
		this.estadoMetamorfosis = estadoMetamorfosis;
	}
	
	// metodos
	abstract public void mostrarForma();		
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/ANFIBIO"); 
	}	
	
	public void mostrarAnimalVertebrado() {
		super.mostrarAnimalVertebrado();
		System.out.println("\tESTADO DE METAMORFOSIS: " + estadoMetamorfosis.toString());
	}
}