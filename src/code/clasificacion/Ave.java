package code.clasificacion;
import code.sangre.SangreTibia;

public abstract class Ave extends SangreTibia {
	//atributos
	protected double envergadura; //wingspan
	
	public Ave(String tipoPiel, String tipoExtremidades, int numExtremidades,
			String tipoAlimentacion, String tipoMobilidad, String nombre,
			String tipoReproduccion, String eliminExcesoCalor, double envergadura) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion,
				tipoMobilidad, nombre, tipoReproduccion, eliminExcesoCalor);
		this.envergadura = envergadura;
	}
	// metodos	
	abstract public void mostrarForma();
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/AVE"); 
	}
	
	public void mostrarAnimal() {
		super.mostrarAnimal();
		System.out.println("\tENVERGADURA DE AVE: " +envergadura + " cm");
	}
}
