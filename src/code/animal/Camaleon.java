package code.animal;

import code.clasificacion.Reptil;
import code.lib.TipoReproduccion;

public class Camaleon extends Reptil {

	public Camaleon(String tipoPiel, String tipoExtremidades, int numExtremidades, 
			String tipoAlimentacion,String tipoMobilidad, String nombre, 
			TipoReproduccion tipoReproduccion, double tempCuerpoActual,
			double tempAmbiente, String ordenReptil) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad,
				nombre, tipoReproduccion, tempCuerpoActual, tempAmbiente,ordenReptil);
		this.clasificacion = "REPTIL";
	}
	
	public void mostrarForma(){
		System.out.println("        _       _._");
		System.out.println(" _,,-''' ''-,_ }'._''.,_.=._");
		System.out.println(",-'      _ _    '        (  @)'-,");
		System.out.println(",'  _..==;;::_::'-     __..----'''}");
		System.out.println(":  .'::_;==''       ,'',: : : '' '}");
		System.out.println("}  '::-'            /   },: : : :_,'");
		System.out.println(":  :'     _..,,_    '., '._-,,,--\'");
		System.out.println("{  ;   .-'       :      '-, ';,__\'");
		System.out.println("{   '  :    _,,,   :__,,--::',,}___}^}_.-");
		System.out.println("}        _,'__''',  ;_.-''_.-'");
		System.out.println(":      ,':-''  ';, ;  ;_..-'");
		System.out.println("_.-' }    ,',' ,''',  : ^^");
		System.out.println("_.-''{    { ; ; 1,', '  :");
		System.out.println("}   } :  ;_,' ;  }");
		System.out.println("{   ',',___,'   '");
		System.out.println("{ ',           ,'");
		System.out.println("'-,,__,,-'");	
	}
}
