package code.clasificacion;
import code.sangre.SangreTibia;

public abstract class Mamifero extends SangreTibia {
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/MAMIFERO"); 
	}

	public void mostrarAnimal() {
		super.mostrarAnimal();
	}
}
