package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for(int element : tabell) {
			if (element == tabell[tabell.length - 1]) {
				System.out.println(element);
			} else {
				System.out.print(element + ", ");
			}
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {	  
		if (tabell.length == 0) { 
			return "[]"; 
		}
		  
		String tabellTilStreng = "["; 
		for(int i = 0; i < tabell.length; i++) { 
			if(i < tabell.length - 1) {
				tabellTilStreng += tabell[i] + ",";
			} else { 
				tabellTilStreng += tabell[i] + "]";
			} 
		}
		return tabellTilStreng;
	}
	
	// c)
	public static int summer(int[] tabell) {
		if (tabell.length == 0) {
			return 0;
		}
		
		int sum = 0;
		
		/**
		c.0 - while)
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
		}
		c.1 - for-løkke)
		for (int j = 0; j < tabell.length; j++) {
			sum += tabell[j];
		}
		**/
		
		// c.2 - utvidet for-løkke)
		for(int element : tabell) {
			sum += element;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		if(tabell.length == 0) {
			return false;
		}
		// return Arrays.binarySearch(tabell, tall) >= 0;
		
		for (int finnes : tabell) {
			if (finnes == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		if (tabell.length == 0) {
			return -1;
		}

		// Søker linjært siden det ikke er spesifisert om tabellen er sortert eller ikke.
		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		if (tabell.length == 0) {
			return tabell;
		}

		int[] reversertTabell = new int[tabell.length];
		for(int i = 0, j = tabell.length - 1; i < tabell.length; i++, j--) {
			reversertTabell[i] = tabell[j];
		}
		return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {		
		if (tabell.length == 0) {
			return true;
		}

		for(int i = 0; i < tabell.length - 1; i++) {
			if(tabell[i] > tabell[i+1]) {
				return false;
			}
		}
		
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {	
		if(tabell1.length == 0) {
			return tabell2; 
		} else if(tabell2.length == 0) {
			return tabell1; 
		} else if (tabell1.length == 0 && tabell2.length == 0) {
			return null;
		}
		int[] sammensatt = new int[tabell1.length + tabell2.length];
		
		// Med .arraycopy()
		/*
		 * System.arraycopy(tabell1, 0, sammensatt, 0, tabell1.length);
		 * System.arraycopy(tabell2, 0, sammensatt, tabell1.length, tabell2.length);
		 * 
		 * return sammensatt;
		 */
        
        // Med for-løkke:
		
		for(int i = 0, j = -tabell1.length; i < sammensatt.length; i++, j++) {
			// Setter først inn tabell1, så settes tabell2 inn etter at tabell1 er ferdig.
			if (i < tabell1.length) {
				sammensatt[i] = tabell1[i];
			} else {
				sammensatt[i] = tabell2[j];
			}
		}
		
		return sammensatt; 
	}
}













