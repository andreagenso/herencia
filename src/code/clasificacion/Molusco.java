package code.clasificacion;

public abstract class Molusco extends Invertebrado {

	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/MOLUSCO"); 
	}
}
