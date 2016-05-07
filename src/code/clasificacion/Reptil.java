package code.clasificacion;

public abstract class Reptil extends Vertebrado {

	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/REPTIL"); 
	}
}
