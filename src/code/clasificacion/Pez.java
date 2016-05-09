package code.clasificacion;
import code.sangre.*;

public abstract class Pez extends SangreFria {

	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/PEZ"); 
	}
	
	public void mostrarAnimal() {
		super.mostrarAnimal();
	}
}
