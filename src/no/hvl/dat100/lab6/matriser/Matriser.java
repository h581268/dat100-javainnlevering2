package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		if (matrise.length == 0) {
			System.out.println("Tom matrise!");
			return;
		}
		
		for (int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		if(matrise.length == 0) {
			return "";
		}
		
		String matriseSomStreng = "";

		for (int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				matriseSomStreng += matrise[i][j] + " ";
			}
			matriseSomStreng += "\n";
		}
		
		return matriseSomStreng;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		if(matrise.length == 0) {
			return matrise;
		}
		
		int[][] skalert = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				skalert[i][j] = matrise[i][j] * tall;
			}
		}
		
		return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length == 0 || b.length == 0) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		if(matrise.length == 0) {
			return matrise;
		}
		
		int[][] speilet = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				speilet[i][j] = matrise[j][i];
			}
		}

		return speilet;	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if(a.length == 0 || b.length == 0) {
			return new int[0][0];
		}
		
		int[][] multiplisert = new int[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for(int k = 0; k < a.length; k++) {
					multiplisert[j][i] += a[j][k] * b[k][i];
				}
			}
		}
		return multiplisert;
	}
}
