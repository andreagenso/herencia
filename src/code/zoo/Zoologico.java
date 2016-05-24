package code.zoo;
import code.top.AnimalVertebrado;

import java.util.*;

public class Zoologico {

	// atributos
	protected String nombreZoologico;
	
	ArrayList<AnimalVertebrado> lista = new ArrayList<AnimalVertebrado>(); 
	private static Zoologico INSTANCE = new Zoologico();
	
	// metodos 
	private Zoologico() {
		if (INSTANCE != null)
			throw new IllegalStateException("Ya fue instanciado");
	}
	
	public static Zoologico getInstancia()
	{	
		return INSTANCE;
	}	
	
	public void agregarAnimal(AnimalVertebrado aux)
	{
		lista.add(aux);
	}
	
	public void mostrarUnAnimal(int i)
	{
		AnimalVertebrado aux;
		aux = lista.get(i);
		System.out.println("\t" +aux.mostrarClasificacionCientifica());
		aux.mostrarAnimalVertebrado();
		System.out.println("\n");
		aux.mostrarForma();
		System.out.println("\n___________________________________________________________________________\n");
	}
	
	public void mostrarTodosAnimales()
	{
		for (int i=0;i<lista.size();i++)
			mostrarUnAnimal(i);
	}
	
	public void mostrarAnimalesporClasificacion(String clasificacion)
	{
		AnimalVertebrado aux;
		for (int i=0;i<lista.size();i++)
		{
			aux = lista.get(i);
			if (aux.getClasificacion() == clasificacion)
				mostrarUnAnimal(i);
		}
	}
	
	public void buscarAnimal(String nom)
	{
		AnimalVertebrado aux;
		for (int i=0;i<lista.size();i++)
		{
			aux = lista.get(i);
			if (aux.getNombre() == nom)
				mostrarUnAnimal(i);
		}
	}
}
