package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(j + " ");
			}
			
		System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String matriseTxt = "";
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseTxt += matrise[i][j] + " ";
			}
			matriseTxt += "\n";
		}
		
		return matriseTxt;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int matrise2[][] = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				matrise2[i][j] = matrise[i][j] * tall;
			}
		}
		
		return matrise2;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if(a.length != b.length) {
			return false;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
			
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int matrise2[][] = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				matrise2[i][j] = matrise[j][i];
			}
		}
		return matrise2;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int matriseAB[][] = new int[a.length][b[0].length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				for(int k = 0; k < a[0].length; k++) {
					matriseAB[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return matriseAB;
	
	}
}
