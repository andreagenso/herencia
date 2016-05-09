package code.animal;
import code.clasificacion.Ave;

public class GorrionComun extends Ave {

	public GorrionComun(String tipoPiel, String tipoExtremidades, int numExtremidades,
			String tipoAlimentacion, String tipoMobilidad, String nombre,
			String tipoReproduccion, String eliminExcesoCalor, double envergadura) {
		super(tipoPiel, tipoExtremidades, numExtremidades, tipoAlimentacion, tipoMobilidad,
				nombre, tipoReproduccion, eliminExcesoCalor, envergadura);
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