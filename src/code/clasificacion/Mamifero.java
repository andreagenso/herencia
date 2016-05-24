package code.clasificacion;

import code.sangre.SangreTibia;
import code.lib.TipoReproduccion; 

public abstract class Mamifero extends SangreTibia {
	
	// atributos
	protected Boolean produceLeche;
	protected int nroPezones;
	
	public Mamifero(String tipoPiel, String tipoExtremidades,
			int numExtremidades, String tipoAlimentacion, String tipoMobilidad,
			String nombre, TipoReproduccion tipoReproduccion, String eliminExcesoCalor, 
			Boolean produceLeche, int numPezones) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion,
				tipoMobilidad, nombre, tipoReproduccion, eliminExcesoCalor);
		this.produceLeche= produceLeche;
		this.nroPezones = numPezones;
		clasificacion = "MAMIFERO";
	}
	
	// metodos
	abstract public void mostrarForma();
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/MAMIFERO"); 
	}

	public void mostrarAnimalVertebrado() {
		super.mostrarAnimalVertebrado();
		if (produceLeche)
			System.out.println("\t" + nombre + ": PRODUCE LECHE");
		else
			System.out.println("\t" + nombre + ": NO PRODUCE LECHE");
		System.out.println("\t" + nombre + ": NUMERO DE PEZONES = " + nroPezones);
	}
}
