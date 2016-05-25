package code.top;
import code.lib.TipoReproduccion;

public abstract class AnimalVertebrado {
	// atributos
	protected String tipoPiel;
	protected String tipoExtremidades; //piernas, tentaculos,alas, etc
	protected int numExtremidades;
	protected String tipoAlimentacion;
	protected TipoReproduccion tipoReproduccion;
	protected String tipoMobilidad; // caminar, nadar, volar, etc	
	protected String nombre;	
	protected String clasificacion; //NUEVO ATRIBUTO
	
	// constructor	
	protected AnimalVertebrado(String tipoPiel, String tipoExtremidades,int numExtremidades, 
			String tipoAlimentacion, String tipoMobilidad, String nombre, TipoReproduccion tipoReproduccion) {
		this.nombre = nombre;
		this.tipoPiel = tipoPiel;
		this.tipoExtremidades = tipoExtremidades;
		this.numExtremidades = numExtremidades;
		this.tipoAlimentacion = tipoAlimentacion;
		this.tipoReproduccion = tipoReproduccion;
		this.tipoMobilidad = tipoMobilidad;
	}
	
	// metodos	
	public abstract void mostrarForma();
	
	public String mostrarClasificacionCientifica() {
		return (nombre + " pertenece a la clasificacion cientifica: ANIMALES ");
	}
	
	public void mostrarAnimalVertebrado() {
		System.out.println("\tNOMBRE DE ANIMAL: " + nombre);
		System.out.println("\tTIPO DE PIEL: " + tipoPiel);
		System.out.println("\tTIPO DE ALIMENTACION: " + tipoAlimentacion);
		System.out.println("\tTIPO DE REPRODUCCION: " + tipoReproduccion);
		System.out.println("\tTIPO DE MOBILIDAD: " + tipoMobilidad);
		System.out.println("\tTIPO DE EXTREMIDADES: " + tipoExtremidades + " Nro: " + numExtremidades);
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	public String getNombre() {
		return nombre;
	}
}