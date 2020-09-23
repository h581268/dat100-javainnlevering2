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
		// Ville brukt return Arrays.toString(tabell); men assert forventet en annen streng formatering, så da blir det slik:
	  
		if (tabell.length == 0) { 
			return "[]"; 
		}
		  
		String tabellTilStreng = "["; 
		for(int i = 0; i < tabell.length; i++) { 
			if(i != tabell.length - 1) {
				tabellTilStreng += tabell[i] + ",";
			} else { 
			tabellTilStreng += tabell[i] + "]";
			} 
		}
		return tabellTilStreng;
	}
	
	// c)
	public static int summer(int[] tabell) {
		
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
		return Arrays.binarySearch(tabell, tall) >= 0;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		// Søk igjennom tabellen etter tall, dersom den finner tallet returner index, 
		// dersom den ikke finner tallet, returner -1 siden det ikke kan være en index i tabellen.
		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		// Sjekker først om tabellen er lengre enn 0, ellers er det ingen vits å fortsette.
		if (tabell.length == 0) {
			return tabell;
		}
		// Lager en ny tabell for å lagre den reverserte tabellen.
		int[] reversertTabell = new int[tabell.length];
		for(int i = 0, j = tabell.length - 1; i < tabell.length; i++, j--) {
			reversertTabell[i] = tabell[j];
		}
		return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		// Tar utgangspunkt i at sortert vil si at den skal gå fra min til max slik Arrays.sort() gjør.
		
		// Sjekker om hvert element i tabellen ikke er mindre enn det forrige. 
		// Dersom et element er mindre enn det forrige, er ikke tabellen sortert.
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
		} 
		int[] sammensatt = new int[tabell1.length + tabell2.length];
		
		// Med Arrays.arraycopy()
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













