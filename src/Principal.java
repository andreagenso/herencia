import code.lib.*;
import code.zoo.Zoologico;
import code.animal.*;
import code.top.AnimalVertebrado;

public class Principal {

	public static void main(String[] args) {
		
		AnimalVertebrado animal;
		Zoologico zoologico = Zoologico.getInstancia();
		
		animal = new Sapo("Permiable por agua, lycra","Piernas",4, "Carnivoro",
				"Caminar, nadar, saltar","Sapo", TipoReproduccion.OVULIPARO,37.05,44.88,
				EstadoMetamorfosis.ADULTO);	
		zoologico.agregarAnimal(animal);
		//---------------
		
		animal = new Camaleon("Escamas","Piernas",4,
				"Carnivoro","Arrastrar","Camaleon",TipoReproduccion.OVIPARO,38.71,39.12,"Squamata");
		zoologico.agregarAnimal(animal);
		//---------------
		
		animal = new Salmon("Escamas","Aletas",5,"Omnivoro",
				"Nadar","Salmon",TipoReproduccion.OVULIPARO,44.45,44.45,2,3);
		zoologico.agregarAnimal(animal);
		//---------------
		
		animal = new GorrionComun("Plumas","Alas",2,"Herbivoro",
				"Volar","Gorrion Comun",TipoReproduccion.OVIPARO,"Evaporation",21.082);
		zoologico.agregarAnimal(animal);
		//---------------
		
		animal = new Perro("Pelo","Patas",4,"Omnivoro","Caminar","Perro labrador",
				TipoReproduccion.VIVIPARO,"Agitarse",true,10);
		zoologico.agregarAnimal(animal);
		//---------------
		
		animal = new Serpiente("Escamas","Cola",1,"Carnivoro","Arrastrar",
				"Serpiente",TipoReproduccion.OVIPARO,22.22,22.22,"Squamata");
		zoologico.agregarAnimal(animal);
		//---------------
		
		// interaccion con el teclado
		@SuppressWarnings("resource")
		java.util.Scanner in = new java.util.Scanner(System.in);
		int opcion;
		String opcionStr;
		String buscar;
		boolean continuarVisita = true;
		
		System.out.println("BIENVENIDO AL ZOOLOGICO " + zoologico.getNombre());
		while(continuarVisita){									
			System.out.println("POR FAVOR ELIJA UNA DE LAS OPCIONES: ");
			System.out.println("\t 1) Mostrar todos los animales");
			System.out.println("\t 2) Buscar animales por clasificacion");
			System.out.println("\t 3) Buscar animal por nombre");
			System.out.println("\t 4) Salir");
			
			opcionStr = in.next();
			try{opcion = Integer.parseInt(opcionStr);}
				catch (java.util.InputMismatchException m){ opcion =  0;}
				catch (Exception e){ opcion =  0;}
			
			switch (opcion) {
			case 1 :
				zoologico.mostrarTodosAnimales();
				break;
			case 2 :
				System.out.println("\tPOR FAVOR ESCRIBA QUE CLASIFICACION DESEA BUSCAR: ");
				buscar = in.next();
				zoologico.mostrarAnimalesporClasificacion(buscar);
				break;
			case 3 :
				System.out.println("\tPOR FAVOR ESCRIBA EL NOMBRE DEL ANIMAL QUE DESEA BUSCAR: ");
				buscar = in.next();
				zoologico.buscarAnimalPorNombre(buscar);
				break;
			case 4 :
				continuarVisita = false;
				System.out.println("\tADIOS VUELVA PRONTO! :-) ");
				break;
			default :	
				System.out.println("\tOPCION DESCONOCIDA, POR FAVOR ELIJA UNA OPCION NUEVAMENTE!");
				break;
			}
		}		
	}
}
