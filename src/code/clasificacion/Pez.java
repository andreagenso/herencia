package code.clasificacion;

public abstract class Pez extends Vertebrado {

	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/PEZ"); 
	}
}
