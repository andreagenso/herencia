package code.clasificacion;
import code.sangre.*;

public abstract class Reptil extends SangreFria {

	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/REPTIL"); 
	}
	
	public void mostrarAnimal() {
		super.mostrarAnimal();
	}
}
