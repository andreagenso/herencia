package code.clasificacion;
import code.sangre.*;

public abstract class Pez extends SangreFria {

	// atributos
	int tipoAletasPares;
	int tipoAletasMediaLinea; // aletas de media linea
	
	// metodos
	protected Pez(String tipoPiel, String tipoExtremidades,
			int numExtremidades, String tipoAlimentacion, String tipoMobilidad,
			String nombre, String tipoReproduccion, double tempCuerpoActual,
			double tempAmbiente, int tipoAletasPares,int tipoAletasMediaLinea ) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion,
				tipoMobilidad, nombre, tipoReproduccion, tempCuerpoActual, tempAmbiente);
		this.tipoAletasMediaLinea = tipoAletasMediaLinea;
		this.tipoAletasPares = tipoAletasPares;
	}

	public abstract void mostrarForma(); 
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/PEZ"); 
	}
	
	public void mostrarAnimal() {
		super.mostrarAnimal();
		System.out.println("\tTIPO DE ALETAS PARES: " + tipoAletasPares);
		System.out.println("\tTIPO DE ALETAS DE MEDIA LINEA: " + tipoAletasMediaLinea);
	}
}