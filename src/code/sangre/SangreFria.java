package code.sangre;
import code.top.Animal;

public abstract class SangreFria extends Animal {
	// atributos
	protected double tempCuerpoActual;
	protected double tempAmbiente;
	
	// metodos
	abstract public void mostrarForma();
	
	protected SangreFria(String tipoPiel, String tipoExtremidades,int numExtremidades, String tipoAlimentacion, String tipoMobilidad, String nombre, String tipoReproduccion, double tempCuerpoActual, double tempAmbiente) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad, nombre, tipoReproduccion);
		this.tempCuerpoActual = tempCuerpoActual; 
		this.tempAmbiente = tempAmbiente;
	}

	public void mostrarAnimal() {
	super.mostrarAnimal();
	System.out.println("\tTEMPERATURA DE CUERPO:" + tempCuerpoActual);
	System.out.println("\tTEMPERATURA DE AMBIENTE:" + tempAmbiente);
	}
	
	public void calcularTempActual() {
	if (tempCuerpoActual < tempAmbiente || tempCuerpoActual > tempAmbiente)
	{
		tempCuerpoActual = tempAmbiente;
		System.out.println(nombre + " se ha adaptado a su entorno natural.");
	}
	else
		System.out.println(nombre + " no ha cambiado su temperatura.");
	}
}