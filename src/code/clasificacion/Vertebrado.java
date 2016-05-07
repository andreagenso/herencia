package code.clasificacion;

public abstract class Vertebrado extends Animal {

	public void calcularMedicacion(int nroKilos){
		int porcentaje = (nroKilos * 1/10);
		System.out.println("\t" + nombre + "con " + nroKilos + " requiere " + porcentaje + "% por via oral.");
	}
	
	public String mostrarClasificacionCientifica(){
		return (super.mostrarClasificacionCientifica() + "/VERTEBRADO"); 
	}
}
