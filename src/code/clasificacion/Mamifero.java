package code.clasificacion;

public abstract class Mamifero extends Vertebrado {
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/MAMIFERO"); 
	}

}
