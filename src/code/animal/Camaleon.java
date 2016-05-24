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
		this.clasificacion = "CAMALEON";
	}
	
	public void mostrarForma(){
		System.out.println("â”ˆâ•±â–‰â–”â–‰â–”â–‰â–”â–‰â•²â–•â–”â•²â”Šâ”Šâ”Šâ”Š");
		System.out.println("â•±â–•â–‹â–•â–‹â–•â–‹â–•â–‹â”ˆâ–”â”ˆâ•°â•²â”Šâ”Šâ”Š");
		System.out.println("â–�â–•â–Žâ–•â–Žâ–•â–Žâ–•â–Žâ”ˆâ–•â–”â•²â•°â•²â”Šâ”Š");
		System.out.println("â–�â•±â–”â–”â•²â–‚â”Šâ”Šâ–‚â–‚â–�â•²â–‡â–�â–•â”Šâ”Š");
		System.out.println("â–�â–�â•±â•²â–•â”Šâ•²â•°â•²â”ˆâ•²â•°â”�â”�â”�Ì¸â”�â•®");
		System.out.println("â•²â•²â–�â•±â–•â”Šâ”Šâ•²â•°â–”â–�â–”â–”â–”â”Šâ•°â•¯");
		System.out.println("â”Šâ•²â–‚â–‚â•±â”Šâ”Šâ”Šâ–”â–”â”Šâ”Šâ”Šâ”Šâ”Šâ”Šâ”Š");													
	}
}
