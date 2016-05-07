package code.clasificacion;

public abstract class Invertebrado extends Animal {
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/INVERTEBRADO"); 
	}
}
