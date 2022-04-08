package Uso_Clases;
import java.util.Scanner;

public class Uso_Tier {
	
	// enum Tier {LO_INTENTASTE, REGULAR, BIEN, MUY_BIEN, EXCELENTE};
	
	enum tier {
		
		LOINTENTASTE("D"), REGULAR("C"), BIEN("B"), MUYBIEN("A"), EXCELENTE("S");
		
		private tier(String abrev) {
			
			this.abrev=abrev;
			
		}
		
		public String getAbrev() {
			
			return abrev;
		}
		
		private String abrev;
	}

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("escriba el tier que quiere ver: LOINTENTASTE, REGULAR, BIEN, MUYBIEN, EXCELENTE");
		String entrada_datos=entrada.next().toUpperCase();
		
		tier su_tier=Enum.valueOf(tier.class, entrada_datos);
		
		System.out.println("Tier=" + su_tier);
		System.out.println ("abreviatura="+ su_tier.getAbrev());
		
		
	}

}
