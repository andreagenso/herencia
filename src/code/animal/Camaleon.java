package code.animal;

import code.clasificacion.Reptil;
import code.lib.TipoReproduccion;

public class Camaleon extends Reptil {

	public Camaleon(String tipoPiel, String tipoExtremidades, int numExtremidades, 
			String tipoAlimentacion,String tipoMobilidad, String nombre, 
			TipoReproduccion tipoReproduccion, double tempCuerpoActual,
			double tempAmbiente, String ordenReptil) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad,
				nombre, tipoReproduccion, tempCuerpoActual, tempAmbiente,ordenReptil);
	}
	
	public void mostrarForma(){
		System.out.println("┈╱▉▔▉▔▉▔▉╲▕▔╲┊┊┊┊");
		System.out.println("╱▕▋▕▋▕▋▕▋┈▔┈╰╲┊┊┊");
		System.out.println("▏▕▎▕▎▕▎▕▎┈▕▔╲╰╲┊┊");
		System.out.println("▏╱▔▔╲▂┊┊▂▂▏╲▇▏▕┊┊");
		System.out.println("▏▏╱╲▕┊╲╰╲┈╲╰━━━̸━╮");
		System.out.println("╲╲▏╱▕┊┊╲╰▔▏▔▔▔┊╰╯");
		System.out.println("┊╲▂▂╱┊┊┊▔▔┊┊┊┊┊┊┊");													
	}
}
