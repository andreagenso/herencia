package code.top;

public abstract class Animal {
	// atributos
	protected String tipoPiel;
	protected String tipoExtremidades; //piernas, tentaculos,alas, etc
	protected int numExtremidades;
	protected String tipoAlimentacion;
	protected String tipoReproduccion;
	protected String tipoMobilidad; // caminar, nadar, volar, etc	
	protected String nombre;
	
	// metodos
	
	public abstract void mostrarForma();
	
	protected Animal(String tipoPiel, String tipoExtremidades,int numExtremidades, String tipoAlimentacion, String tipoMobilidad, String nombre, String tipoReproduccion) {
		this.nombre = nombre;
		this.tipoPiel = tipoPiel;
		this.tipoExtremidades = tipoExtremidades;
		this.numExtremidades = numExtremidades;
		this.tipoAlimentacion = tipoAlimentacion;
		this.tipoReproduccion = tipoReproduccion;
		this.tipoMobilidad = tipoMobilidad;
	}
	
	public String mostrarClasificacionCientifica() {
		return (nombre + " pertenece a la clasificacion cientifica: ANIMALES ");
	}
	
	public void mostrarAnimal() {
		System.out.println("\tNOMBRE DE ANIMAL: " + nombre);
		System.out.println("\tTIPO DE PIEL: " + tipoPiel);
		System.out.println("\tTIPO DE ALIMENTACION: " + tipoAlimentacion);
		System.out.println("\tTIPO DE REPRODUCCION: " + tipoReproduccion);
		System.out.println("\tTIPO DE MOBILIDAD: " + tipoMobilidad);
		System.out.println("\tTIPO DE EXTREMIDADES: " + tipoExtremidades + " Nro: " + numExtremidades);
	}
}
