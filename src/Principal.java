import code.animal.*;
import code.clasificacion.*;

public class Principal {

	public static void main(String[] args) {
				
		// ToDo aqui vendran las llamadas principales para ver la ejecucion del programa
		Animal animal = new Sapo();
		
		animal.mostrarForma();
		System.out.println(animal.mostrarClasificacionCientifica());
		
	}

}
