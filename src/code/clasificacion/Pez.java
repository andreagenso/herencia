package code.clasificacion;
import code.sangre.*;
import code.lib.TipoReproduccion;

public abstract class Pez extends SangreFria {

	// atributos
	int tipoAletasPares;
	int tipoAletasMediaLinea; // aletas de media linea
	
	// metodos
	protected Pez(String tipoPiel, String tipoExtremidades,
			int numExtremidades, String tipoAlimentacion, String tipoMobilidad,
			String nombre, TipoReproduccion tipoReproduccion, double tempCuerpoActual,
			double tempAmbiente, int tipoAletasPares,int tipoAletasMediaLinea ) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion,
				tipoMobilidad, nombre, tipoReproduccion, tempCuerpoActual, tempAmbiente);
		this.tipoAletasMediaLinea = tipoAletasMediaLinea;
		this.tipoAletasPares = tipoAletasPares;
		clasificacion = "PEZ";
	}

	public abstract void mostrarForma(); 
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/PEZ"); 
	}
	
	public void mostrarAnimalVertebrado() {
		super.mostrarAnimalVertebrado();
		System.out.println("\tTIPO DE ALETAS PARES: " + tipoAletasPares);
		System.out.println("\tTIPO DE ALETAS DE MEDIA LINEA: " + tipoAletasMediaLinea);
	}
}