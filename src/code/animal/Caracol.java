package code.animal;

import code.clasificacion.Molusco;

public class Caracol extends Molusco {

	public Caracol() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularAlimentacion(int nroKilos) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override 
	public void mostrarForma() {
		System.out.println("@             _________");
		System.out.println(" \\____       /         \\");
		System.out.println(" /    \\     /   ____    \\");
		System.out.println(" \\_    \\   /   /    \\    \\");
		System.out.println("   \\    \\ (    \\__/  )    )");
		System.out.println("    \\    \\_\\ \\______/    /");
		System.out.println("     \\      \\           /___");
		System.out.println("      \\______\\_________/____\"-_");
	}

}
