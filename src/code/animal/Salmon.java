package code.animal;

import code.clasificacion.Pez;

public class Salmon extends Pez {

	public Salmon() {
	}

	@Override
	public int calcularAlimentacion(int nroKilos) {		
		return 0;
	}
	
	@Override
	public void mostrarForma(){
	    System.out.println("o   o");
	    System.out.println("              /^^^^^7");
	    System.out.println("'  '     ,oO))))))))Oo,");
	    System.out.println("       ,'))))))))))))))), /{");
	    System.out.println("  '  ,'o  ))))))))))))))))={");
	    System.out.println("     >    ))))))))))))))))={");
	    System.out.println("     `,   ))))))\\ \\)))))))={");  
	    System.out.println("       ',))))))))\\/)))))' \\{");
	    System.out.println("         '*O))))))))O*'");			
	}

}
