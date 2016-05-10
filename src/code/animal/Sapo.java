package code.animal;

import code.clasificacion.Anfibio;
import code.lib.TipoReproduccion;
import code.lib.EstadoMetamorfosis;

public class Sapo extends Anfibio {

	public Sapo(String tipoPiel, String tipoExtremidades, int numExtremidades, 
			String tipoAlimentacion, String tipoMobilidad, String nombre, 
			TipoReproduccion tipoReproduccion, double tempCuerpoActual,
			double tempAmbiente, EstadoMetamorfosis estadoMetamorfosis) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad,
				nombre, tipoReproduccion, tempCuerpoActual, tempAmbiente, estadoMetamorfosis);
	}

	public void mostrarForma(){				
		System.out.println("                                 \\ |_||_| /");
		System.out.println("              (^)_(^)             \\ | /| /");
		System.out.println("   ~    ______(-----)_.__          \\|/ |/");
		System.out.println("~       _..   _  /_____\\  _ .._");
		System.out.println("    :     / \\/ |   | \\/ \\   `.");
		System.out.println("~    `___ |_\\__|___|__/_|     `.     ~");
		System.out.println("         /|\\  /|\\ /|\\  /|\\      ;");
		System.out.println("  .____.o o oo o o o oo o o      ;");			
	}
}
