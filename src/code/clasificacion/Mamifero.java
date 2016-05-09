package code.clasificacion;
import code.sangre.SangreTibia;

public abstract class Mamifero extends SangreTibia {
	
	// atributos
	protected Boolean glandulasMamarias;
	
	public Mamifero(String tipoPiel, String tipoExtremidades,
			int numExtremidades, String tipoAlimentacion, String tipoMobilidad,
			String nombre, String tipoReproduccion, String eliminExcesoCalor, Boolean glandulasMamarias) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion,
				tipoMobilidad, nombre, tipoReproduccion, eliminExcesoCalor);
		this.glandulasMamarias = glandulasMamarias;
	}
	
	// metodos
	abstract public void mostrarForma();
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/MAMIFERO"); 
	}

	public void mostrarAnimal() {
		super.mostrarAnimal();
		if (glandulasMamarias == true)
			System.out.println(nombre + " PRODUCE LECHE");
	}
}
