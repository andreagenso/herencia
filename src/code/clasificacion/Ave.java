package code.clasificacion;

public abstract class Ave extends Vertebrado {
	//atributos
	
	// metodos	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/AVE"); 
	}
}
