package code.clasificacion;

public abstract class Animal {
	// atributos
	protected String tipoPiel;
	protected String nombre;
	protected String tipoExtremidades; //piernas, tentaculos,alas, etc
	protected int numExtremidades;
	protected String tipoAlimentacion;
	protected String tipoReproduccion;
	protected String tipoMobilidad; // caminar, nadar, volar, etc
	protected String comunicacion= "..."; 		
	
	// metodos
	
	public abstract void mostrarForma();
	public abstract int calcularAlimentacion(int nroKilos);
	
	// sobrecarga
	public String mostrarClasificacionCientifica(){
		return (nombre + " pertenece a la clasificación científica: ANIMALES ");
	}
	
	public String comunicar(){
		return comunicacion;
	}
	
	public void mostrarAnimal() {
		System.out.println("\tNOMBRE DE ANIMAL:" + nombre);
		System.out.println("\tTIPO DE PIEL:" + tipoPiel);
		System.out.println("\tTIPO DE ALIMENTACION:" + tipoAlimentacion);
		System.out.println("\tTIPO DE REPRODUCCION:" + tipoReproduccion);
		System.out.println("\tTIPO DE MOBILIDAD:" + tipoMobilidad);
		System.out.println("\tTIPO DE EXTREMIDADES:" + tipoExtremidades + " Nro: " + numExtremidades);
	}
			

}
