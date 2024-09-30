package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i] + " ");
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tabellTxt = "[";
		
		for(int i = 0; i < tabell.length; i++) {
			tabellTxt = tabellTxt + tabell[i];
			
			if(i+1 < tabell.length) {
				tabellTxt = tabellTxt + ",";
			}
		}
		
		tabellTxt = tabellTxt + "]";
		
		return tabellTxt;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		
		for(int i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				return true;
			}
		}
		
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos = -1;
		
		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				pos = i;
				break;
			}
		}
		
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int tab[] = new int[tabell.length];
		
		for(int i = 0; i < tabell.length; i++) {
			tab[i] = tabell[tabell.length - i - 1];
		}
		
		return tab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean status = true;

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i+1]) {
				status = false;
				break;
			}
		}
		
		return status;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int tabell3[] = new int[tabell1.length + tabell2.length];
		int i;
		
		for(i = 0; i < tabell1.length; i++) {
			tabell3[i] = tabell1[i];
		}
		
		for(int j = 0; j < tabell2.length; j++) {
			tabell3[i+j] = tabell2[j];
		}

		return tabell3;
	}
	
}
