/*
import code.animal.*;
import code.top.AnimalVertebrado;
import code.lib.EstadoMetamorfosis;
import code.lib.TipoReproduccion;
import code.sangre.*;

public class Principal {

	public static void main(String[] args) {
		
		AnimalVertebrado frog = new Sapo("Permiable por agua, lycra","Piernas",4, "Carnivoro",
				"Caminar, nadar, saltar","Sapo", TipoReproduccion.OVULIPARO,37.05,44.88,
				EstadoMetamorfosis.ADULTO);	
		System.out.println(frog.mostrarClasificacionCientifica());
		System.out.println("\n");
		frog.mostrarAnimalVertebrado();
		System.out.println("\n");
		frog.mostrarForma();
		System.out.println("\n");
		((SangreFria) frog).calcularTempActual();
		System.out.println("------------------------------------------------------\n");
		
		AnimalVertebrado chameleon = new Camaleon("Escamas","Piernas",4,
				"Carnivoro","Arrastrar","Camaleon",TipoReproduccion.OVIPARO,38.71,39.12,"Squamata");
		System.out.println(chameleon.mostrarClasificacionCientifica());
		System.out.println("\n");
		chameleon.mostrarAnimalVertebrado();
		System.out.println("\n");
		chameleon.mostrarForma();
		System.out.println("\n");
		((SangreFria) chameleon).calcularTempActual();
		System.out.println("------------------------------------------------------\n");
		
		AnimalVertebrado salmon = new Salmon("Escamas","Aletas",5,"Omnivoro",
				"Nadar","Salmon",TipoReproduccion.OVULIPARO,44.45,44.45,2,3);
		System.out.println(salmon.mostrarClasificacionCientifica());
		System.out.println("\n");
		salmon.mostrarAnimalVertebrado();
		System.out.println("\n");
		salmon.mostrarForma();
		System.out.println("\n");
		((SangreFria) salmon).calcularTempActual();		
		System.out.println("------------------------------------------------------\n");
		
		AnimalVertebrado gorrion = new GorrionComun("Plumas","Alas",2,"Herbivoro",
				"Volar","Gorrion Comun",TipoReproduccion.OVIPARO,"Evaporation",21.082);
		System.out.println(gorrion.mostrarClasificacionCientifica());
		System.out.println("\n");
		gorrion.mostrarAnimalVertebrado();
		System.out.println("\n");
		gorrion.mostrarForma();
		System.out.println("\n");
		System.out.println("------------------------------------------------------\n");
		
		AnimalVertebrado perro = new Perro("Pelo","Patas",4,"Omnivoro","Caminar","Perro labrador",
			TipoReproduccion.VIVIPARO,"Agitarse",true,10);
		System.out.println(perro.mostrarClasificacionCientifica());
		System.out.println("\n");
		perro.mostrarAnimalVertebrado();
		System.out.println("\n");
		perro.mostrarForma();
		System.out.println("\n");
		System.out.println("------------------------------------------------------\n");
	}
}
*/

import code.zoo.Zoologico;
import code.animal.*;
import code.top.AnimalVertebrado;
import code.lib.EstadoMetamorfosis;
import code.lib.TipoReproduccion;

public class Principal {

	public static void main(String[] args) {
		AnimalVertebrado frog = new Sapo("Permiable por agua, lycra","Piernas",4, "Carnivoro",
				"Caminar, nadar, saltar","Sapo", TipoReproduccion.OVULIPARO,37.05,44.88,
				EstadoMetamorfosis.ADULTO);	
		AnimalVertebrado chameleon = new Camaleon("Escamas","Piernas",4,
				"Carnivoro","Arrastrar","Camaleon",TipoReproduccion.OVIPARO,38.71,39.12,"Squamata");
		AnimalVertebrado salmon = new Salmon("Escamas","Aletas",5,"Omnivoro",
				"Nadar","Salmon",TipoReproduccion.OVULIPARO,44.45,44.45,2,3);
		AnimalVertebrado gorrion = new GorrionComun("Plumas","Alas",2,"Herbivoro",
				"Volar","Gorrion Comun",TipoReproduccion.OVIPARO,"Evaporation",21.082);
		AnimalVertebrado perro = new Perro("Pelo","Patas",4,"Omnivoro","Caminar","Perro labrador",
				TipoReproduccion.VIVIPARO,"Agitarse",true,10);
		
		Zoologico.getInstancia().agregarAnimal(frog);
		Zoologico.getInstancia().agregarAnimal(chameleon);
		Zoologico.getInstancia().agregarAnimal(gorrion);
		Zoologico.getInstancia().agregarAnimal(salmon);
		Zoologico.getInstancia().agregarAnimal(perro);
		//Zoologico.getInstancia().mostrarTodosAnimales();
		//Zoologico.getInstancia().mostrarAnimalesporClasificacion("AVE");
		//Zoologico.getInstancia().buscarAnimal("Perro labrador");
	}
}













