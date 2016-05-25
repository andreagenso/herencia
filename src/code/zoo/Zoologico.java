package code.zoo;

import code.top.AnimalVertebrado;

import java.util.*;

public class Zoologico {
	// atributos
	protected String nombreZoologico;
	ArrayList<AnimalVertebrado> animalList = new ArrayList<AnimalVertebrado>(); 

	// crear una unica instancia
	private static Zoologico INSTANCE = new Zoologico();
	
	// constructor
	private Zoologico() {
		if (INSTANCE != null)
			throw new IllegalStateException("Ya fue instanciado");
		else
			nombreZoologico = "NOEL KEMPF";
	}
	
	public static Zoologico getInstancia() {	
		return INSTANCE;
	}
	
	// metodos
	public String getNombre() {
		return nombreZoologico;
	}
	
	public void agregarAnimal(AnimalVertebrado animalVertebrado){		
		System.out.println("\n__________________________________");
		System.out.println("AGREGANDO ANIMAL:" + animalVertebrado.getNombre());
		System.out.println("ASIGNANDO JAULA NRO:" + animalList.size());
		if (animalList.add( animalVertebrado)){
			System.out.println("ASIGNACION EXITOSA, BIENVENIDO " + animalVertebrado.getNombre());
		} else {
			System.out.println("ASIGNACION ERRONEA, SE DEBE REVISAR LA ASIGNACION DE " + 
					animalVertebrado.getNombre());
		}				
		System.out.println("__________________________________");
	}
	
	public void mostrarAnimalPorJaula(int jaula)
	{		
		AnimalVertebrado animalVertebrado = animalList.get(jaula);
		
		System.out.println("__________________________________");
		System.out.println("MOSTRANDO INFORMACION DE ANIMAL " + animalVertebrado.getNombre() + " EN JAULA NRO " + jaula);
		mostrarAnimalVertebrado(animalVertebrado);
		System.out.println("__________________________________");
	}
	
	private void mostrarAnimalVertebrado(AnimalVertebrado animalVertebrado){
		System.out.println("\t" + animalVertebrado.mostrarClasificacionCientifica());
		animalVertebrado.mostrarAnimalVertebrado();	
		animalVertebrado.mostrarForma();
	}
	
	public void mostrarTodosAnimales()
	{
		System.out.println("__________________________________");
		System.out.println("MOSTRANDO INFORMACION DE TODO EL ZOOLOGICO " + nombreZoologico + 
				" NRO DE JAULAS TOTAL: " + animalList.size());
		for (int i=0;i<animalList.size();i++)
			mostrarAnimalPorJaula(i);
		System.out.println("GRACIAS POR SU VISITA :-) ");
		System.out.println("__________________________________");
	}
	
	public void mostrarAnimalesporClasificacion(String clasificacion) {
		ArrayList<AnimalVertebrado> animalPorClasificacionList = buscarAnimalesPorClasificacion(clasificacion);
		
		System.out.println("__________________________________");
		System.out.println("MOSTRANDO ANIMALES POR CLASIFICACION: " + clasificacion.toUpperCase() );
		System.out.println("TOTAL DE ANIMALES ENCONTRADOS: " + animalPorClasificacionList.size());
				
		for (int i=0;i<animalPorClasificacionList.size();i++) {			
			mostrarAnimalVertebrado(animalPorClasificacionList.get(i));
		}				
		System.out.println("__________________________________");
	}
	
	private ArrayList<AnimalVertebrado> buscarAnimalesPorClasificacion(String clasificacion){
		ArrayList<AnimalVertebrado> animalPorClasificacionList = new ArrayList<AnimalVertebrado>();
		
		for (int i=0;i<animalList.size();i++)
		{
			AnimalVertebrado animalVertebrado = animalList.get(i);
			if (animalVertebrado.getClasificacion().toUpperCase().contains(clasificacion.toUpperCase()))
				animalPorClasificacionList.add(animalVertebrado);
		}
		
		return animalPorClasificacionList;
	}
			
	public void buscarAnimalPorNombre(String nombre) {
		ArrayList<AnimalVertebrado> animalVertebradoEncontradoList = new ArrayList<AnimalVertebrado>();
		
		for (int i=0;i<animalList.size();i++)
		{
			AnimalVertebrado animalVertebrado = animalList.get(i);
			if (animalVertebrado.getNombre().toUpperCase().contains(nombre.toUpperCase()))
				animalVertebradoEncontradoList.add(animalVertebrado);
		}
		
		System.out.println("__________________________________");
		if (animalVertebradoEncontradoList.isEmpty())
			System.out.println(" ANIMAL CON EL NOMBRE " + nombre + " NO ENCONTRADO!");
		else {
			System.out.println(" ANIMAL CON EL NOMBRE " + nombre + 
					" ENCONTRADO! NRO DE COINCIDENCIAS: " + animalVertebradoEncontradoList.size());
			
			for (int i=0;i<animalVertebradoEncontradoList.size();i++)
			{
				AnimalVertebrado animalVertebrado = animalVertebradoEncontradoList.get(i);
				mostrarAnimalVertebrado(animalVertebrado);
			}
		}
		System.out.println("__________________________________");	
	}
}
