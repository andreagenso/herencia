package code.animal;

import code.clasificacion.Mamifero;

public class Gato extends Mamifero {

	public Gato() {
		 
	}

	@Override
	public int calcularAlimentacion(int nroKilos) {		
		return 0;
	}
	
	@Override
	public void mostrarForma() {
	    System.out.println("_                ___       _.--.");
	    System.out.println("\\`.|\\..----...-'`   `-._.-'_.-'`");
	    System.out.println("/  ' `         ,       __.--'");
	    System.out.println(")/' _/     \\   `-_,   /");
	    System.out.println("`-'\" `\"\\_  ,_.-;_.-\\_ ',  ");   
	    System.out.println("_.-'_./   {_.'   ; /");
	    System.out.println("{_.-``-'         {_/");
	
	}

}
