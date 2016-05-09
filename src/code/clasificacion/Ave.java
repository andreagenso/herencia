package code.clasificacion;

import code.sangre.SangreTibia;
import code.lib.TipoPico;
import code.lib.TipoReproduccion;

public abstract class Ave extends SangreTibia {
	//atributos
	protected double envergadura; //wingspan
	protected TipoPico tipoPico;
	
	public Ave(String tipoPiel, String tipoExtremidades, int numExtremidades,
			String tipoAlimentacion, String tipoMobilidad, String nombre,
			TipoReproduccion tipoReproduccion, String eliminExcesoCalor, double envergadura, 
			TipoPico tipoPico) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion,
				tipoMobilidad, nombre, tipoReproduccion, eliminExcesoCalor);
		this.envergadura = envergadura;
		this.tipoPico = tipoPico;
	}
	// metodos	
	abstract public void mostrarForma();
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/AVE"); 
	}
	
	public void mostrarAnimal() {
		super.mostrarAnimal();
		System.out.println("\tENVERGADURA DE AVE: " + envergadura + " cm");
		System.out.println("\tTIPO DE PICO DE AVE: " + tipoPico.toString());
	}
}
