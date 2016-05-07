package code.clasificacion;

public abstract class Anfibio extends Vertebrado {
	//atributos
	// metodos
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/ANFIBIO"); 
	}
}
