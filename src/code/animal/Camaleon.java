package code.animal;

import code.clasificacion.Reptil;

public class Camaleon extends Reptil {

	public Camaleon() {	
	}

	@Override
	public int calcularAlimentacion(int nroKilos) {		
		return 0;
	}
	
	
	@Override
	public void mostrarForma(){
		System.out.println(".");
		System.out.println("┈╱▉▔▉▔▉▔▉╲▕▔╲┊┊┊┊");
		System.out.println("╱▕▋▕▋▕▋▕▋┈▔┈╰╲┊┊┊");
		System.out.println("▏▕▎▕▎▕▎▕▎┈▕▔╲╰╲┊┊");
		System.out.println("▏╱▔▔╲▂┊┊▂▂▏╲▇▏▕┊┊");
		System.out.println("▏▏╱╲▕┊╲╰╲┈╲╰━━━̸━╮");
		System.out.println("╲╲▏╱▕┊┊╲╰▔▏▔▔▔┊╰╯");
		System.out.println("┊╲▂▂╱┊┊┊▔▔┊┊┊┊┊┊┊");											
		
	}

}
