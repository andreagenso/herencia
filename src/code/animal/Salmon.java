package code.animal;

import code.clasificacion.Pez;
import code.lib.TipoReproduccion;

public class Salmon extends Pez {

	public Salmon(String tipoPiel, String tipoExtremidades,
			int numExtremidades, String tipoAlimentacion, String tipoMobilidad,
			String nombre, TipoReproduccion tipoReproduccion, double tempCuerpoActual,
			double tempAmbiente, int tipoAletasPares,int tipoAletasMediaLinea) {
		super(tipoPiel,tipoExtremidades,numExtremidades, tipoAlimentacion,tipoMobilidad,
			nombre,tipoReproduccion, tempCuerpoActual, tempAmbiente, tipoAletasPares, 
			tipoAletasMediaLinea);
		this.clasificacion = "PEZ";
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
