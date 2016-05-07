package code.clasificacion;

public abstract class Artropodo extends Invertebrado {
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/ARTROPODO"); 
	}

}
