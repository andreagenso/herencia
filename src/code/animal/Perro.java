package code.animal;

import code.clasificacion.Mamifero;
import code.lib.TipoReproduccion;

public class Perro extends Mamifero {

	public Perro(String tipoPiel, String tipoExtremidades,
			int numExtremidades, String tipoAlimentacion, String tipoMobilidad,
			String nombre, TipoReproduccion tipoReproduccion, String eliminExcesoCalor, 
			Boolean produceLeche,int nroPezones) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion,
				tipoMobilidad, nombre, tipoReproduccion, eliminExcesoCalor,produceLeche, nroPezones);
		this.clasificacion = "MAMIFERO";
	}
	
	@Override
	public void mostrarForma(){		
		System.out.println("______________________$$$$$$$$");
		System.out.println("_______________$$$$$$$________$$$$$$$$$");
		System.out.println("_____________$$________________________$$$$");
		System.out.println("____________$$_____________________________$$");
		System.out.println("___________$__________________________________$$");
		System.out.println("___________$$___________________________________$$");
		System.out.println("__________$$__$$______________________$$__________$$");
		System.out.println("________$$__$$___$$$$_________$$$$____$$__________$$$$");
		System.out.println("______$$___$$__$$$$__$$_____$$$$__$$_$$_____________$$$");
		System.out.println("______$$___$$____$$$$_________$$$$___$$_______________$$");
		System.out.println("______$$___$$________________________$$_______________$$");
		System.out.println("______$$____$$_______________________$$_____________$$");
		System.out.println("________$$__$$____$$$$$$_____________$$___________$$$");
		System.out.println("________$$__$$__$$______$$___________$$_________$$");
		System.out.println("________$$__$$__$$______$$___________$$_______$$");
		System.out.println("__________$$$$____$$$$$$_____________$$$$____$$$$");
		System.out.println("__________$$$$_____________________$$__$$____$$$");
		System.out.println("___________$$_$$$$$$$$$$$$_____$$$$______$$$$_$$");
		System.out.println("_____________$$___$$______$$$$$_______________$$");
		System.out.println("_____________$$_____$$$$$$$____________________$$");
		System.out.println("_____________$$________________________________$$");
		System.out.println("____________$$_________________________________$$");
		System.out.println("____________$$_________________________________$$");
		System.out.println("____________$$___________________________________$");
		System.out.println("____________$$___________________________________$$");
		System.out.println("__________$$_________________________$$___________$");
		System.out.println("__________$$__________$$___________$$_____________$$");
		System.out.println("________$$__$$________$$_________$$_______________$$");
		System.out.println("______$$____$$__________$$_______$$_______________$$");
		System.out.println("______$$____$$____________$$___$$_________________$$");
		System.out.println("____$$______$$_____________$$_$$_______$$_________$$");
		System.out.println("____$$______$$________$$____$$$________$$_________$$");
		System.out.println("____$$______$$________$$____$$$_______$$__________$$");
		System.out.println("____$$______$$________$$_______________$$__________$$");
		System.out.println("____$$______$$________$$_______________$$____________$");
		System.out.println("_$$$$_______$$________$$_______________$$____________$$");
		System.out.println("$___$$______$$________$$$$___________$$$$____________$$");
		System.out.println("$___$$______$$________$$__$$_______$$__$$____________$$");
		System.out.println("_$$$$$______$$________$$____$$___$$_____$$___________$$");
		System.out.println("____$$______$$________$$______$$_______$$___________$$");
		System.out.println("____$$______$$________$$_____$$________$$___________$$");
		System.out.println("__$$________$$________$$$$$$$$___$$$$$$__$$_________$$");
		System.out.println("__$$________$$________$$______$$$______$$$$_________$$");
		System.out.println("$$________$$__________$$_________$$$$$$__$$__________$");
		System.out.println("$$______$$__________$$$$$$$$$$$$$$$______$$__________$");
		System.out.println("$$_$$_$$$__________$$_____________$$$$$$$__$$_________$");
		System.out.println("_$$$$$$$___________$$______________________$$________$$");
		System.out.println("_____$$__$$__$$__$$_$______________________$$__________$$");
		System.out.println("______$$$$__$___$__$$______________________$$____________$");
		System.out.println("_______$$___$___$__$________________________$$_$__$$__$$__$");
		System.out.println("_________$$$$$$$$$$__________________________$$_$_$$$$$$$$");
	}
}
