package code.clasificacion;
import code.sangre.*;
import code.lib.TipoReproduccion;

public abstract class Reptil extends SangreFria {

	// atributos
	protected String ordenReptil; //Crocodilia, Sphenodontia, Squamata, Testudines   
	
	// metodos
	abstract public void mostrarForma();
	
	protected Reptil(String tipoPiel, String tipoExtremidades, int numExtremidades,
			String tipoAlimentacion, String tipoMobilidad, String nombre,
			TipoReproduccion tipoReproduccion, double tempCuerpoActual, double tempAmbiente, 
			String ordenReptil) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad,
				nombre, tipoReproduccion, tempCuerpoActual, tempAmbiente);
		this.ordenReptil = ordenReptil;
		this.clasificacion = "REPTIL";
	}

	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/REPTIL"); 
	}
	
	public void mostrarAnimalVertebrado() {
		super.mostrarAnimalVertebrado();
		System.out.println("\tPERTENENCE AL ORDEN DE REPTIL: " + ordenReptil);
	}
}

