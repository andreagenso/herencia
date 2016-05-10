package code.sangre;
import code.top.AnimalVertebrado;
import code.lib.TipoReproduccion;

public abstract class SangreFria extends AnimalVertebrado {
	// atributos
	protected double tempCuerpoActual;
	protected double tempAmbiente;
	
	// constructor
	protected SangreFria(String tipoPiel, String tipoExtremidades,int numExtremidades, 
			String tipoAlimentacion, String tipoMobilidad, String nombre, TipoReproduccion tipoReproduccion, 
			double tempCuerpoActual, double tempAmbiente) {
		
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, 
				tipoMobilidad, nombre, tipoReproduccion);
		this.tempCuerpoActual = tempCuerpoActual; 
		this.tempAmbiente = tempAmbiente;
	}

	// metodos
	abstract public void mostrarForma();
		
	public void mostrarAnimalVertebrado() {
		super.mostrarAnimalVertebrado();
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
	
	public void calcularTempActual(double temAmbiente) {
		if (tempCuerpoActual < tempAmbiente || tempCuerpoActual > tempAmbiente)
		{
			tempCuerpoActual = tempAmbiente;
			System.out.println(nombre + " se ha adaptado a su entorno natural.");
		}
		else
			System.out.println(nombre + " no ha cambiado su temperatura.");
	}
		
}