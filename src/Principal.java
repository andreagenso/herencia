import code.animal.*;
import code.top.Animal;

public class Principal {

	public static void main(String[] args) {
		/*
		Animal frog = new Sapo("Permiable por agua, lycra","Piernas",4,"Carnivoro","Caminar, nadar, saltar","Sapo","Poner huevos",37.05,44.88,"Adulto");	
		System.out.println(frog.mostrarClasificacionCientifica());
		System.out.println("\n");
		frog.mostrarAnimal();
		System.out.println("\n");
		frog.mostrarForma();
		System.out.println("\n");
		((SangreFria) frog).calcularTempActual();
		
		Animal chameleon = new Camaleon("Escamas","Piernas",4,"Carnivoro","Arrastrar","Camaleon","Oviparo",38.71,39.12,"Squamata");
		System.out.println(chameleon.mostrarClasificacionCientifica());
		System.out.println("\n");
		chameleon.mostrarAnimal();
		System.out.println("\n");
		chameleon.mostrarForma();
		System.out.println("\n");
		((SangreFria) chameleon).calcularTempActual();
		
		Animal salmon = new Salmon("Escamas","Aletas",5,"Omnivoro","Nadar","Salmon","Poner huevos",44.45,44.45,2,3);
		System.out.println(salmon.mostrarClasificacionCientifica());
		System.out.println("\n");
		salmon.mostrarAnimal();
		System.out.println("\n");
		salmon.mostrarForma();
		System.out.println("\n");
		((SangreFria) salmon).calcularTempActual();
		*/
		
		Animal gorrion = new GorrionComun("Plumas","Alas",2,"Herbivoro","Volar","Gorrion Comun","Poner huevos","Evaporation",21.082);
		System.out.println(gorrion.mostrarClasificacionCientifica());
		System.out.println("\n");
		gorrion.mostrarAnimal();
		System.out.println("\n");
		gorrion.mostrarForma();
		System.out.println("\n");
	}
}