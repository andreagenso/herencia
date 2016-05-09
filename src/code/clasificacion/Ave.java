package code.clasificacion;
import code.sangre.SangreTibia;

public abstract class Ave extends SangreTibia {
	//atributos
	
	// metodos	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/AVE"); 
	}
	
	public void mostrarAnimal() {
		super.mostrarAnimal();
	}
}
