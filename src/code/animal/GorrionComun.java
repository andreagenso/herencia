package code.animal;

import code.clasificacion.Ave;
import code.lib.TipoPico;
import code.lib.TipoReproduccion;

public class GorrionComun extends Ave {

	public GorrionComun(String tipoPiel, String tipoExtremidades, int numExtremidades,
			String tipoAlimentacion, String tipoMobilidad, String nombre,
			TipoReproduccion tipoReproduccion, String eliminExcesoCalor, double envergadura) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad,
				nombre, tipoReproduccion, eliminExcesoCalor, envergadura, TipoPico.GENERALISTA);
	}
	
	@Override
	public void mostrarForma(){		
		System.out.println("        _.----._");
		System.out.println("      ,'.::.--..:._");
		System.out.println("	/::/_,-<o)::;_`-._");
		System.out.println("	::::::::`-';'`,--`-`");
		System.out.println("	;::;'|::::,','");
		System.out.println(",'::/  ;:::/, :.");
		System.out.println("/,':/  /::;' \\ ':\\");
		System.out.println(":'.:: ,-''   . `.::\\");
		System.out.println("\\.:;':.    `    :: .:");
		System.out.println("(;' ;;;       .::' :|");
		System.out.println(" \\,:;;      \\ `::. .\\");
		System.out.println(" `);'        '::'  `:");
		System.out.println("  \\.  `        `'  .:      _,'");
		System.out.println("   `.: ..  -. ' :. :/  _.-' _.-");
		System.out.println("     >;._.:._.;,-=_(.-'  __ `._");
		System.out.println("   ,;'  _..-((((''  .,-''  `-._");
		System.out.println("_,'<.-''  _..``'.'`-'`.        `");
		System.out.println("_.-((((_..--''       \\ \\ `.`.");
		System.out.println("-'  _.``'               \\      ` ");
		System.out.println(",'");	
	}
}