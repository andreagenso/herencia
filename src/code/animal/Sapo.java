package code.animal;

import code.clasificacion.Anfibio;

public class Sapo extends Anfibio {

	public Sapo() {
		this.nombre = "Sapo";
	}

	@Override
	public int calcularAlimentacion(int nroKilos) {
		return 0;
	}
	
	@Override
	public void mostrarForma(){				
		System.out.println("        ())                           _|_");
		System.out.println("'''''''''''(||)0                       _|_| |");
		System.out.println("                                   | || |  /");
		System.out.println("                                 \\ |_||_| /");
		System.out.println("              (^)_(^)             \\ | /| /");
		System.out.println("   ~    ______(-----)_.__        ~ \\|/ |/");
		System.out.println("~       _..   _  /_____\\  _ .._");
		System.out.println("    :     / \\/ |   | \\/ \\   `.");
		System.out.println("~    `___ |_\\__|___|__/_|     `.     ~");
		System.out.println("         /|\\  /|\\ /|\\  /|\\      ;");
		System.out.println("  .____.o o oo o o o oo o o     ;");
		System.out.println("~  :                           _.        ~");
		System.out.println("  :__                       __.");
		System.out.println("~       :_____         _____...");
		System.out.println("          :.......:             ~");
		System.out.println("      ~");						
	}

}
