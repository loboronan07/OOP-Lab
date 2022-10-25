package myPackages.p1;

public class Maximum {
	public static int max(int a, int b, int c) {
		return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
	}

	public static float max(float a, float b, float c) {
		return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
	}

	public static int max(int[] arr) {
		int large = -1;

		for(int i=0; i<arr.length; i++) 
			if(large == -1 || arr[i] > arr[large])
				large = i;

		if(large != -1) 
			return arr[large];

		return 0;
	}
	
	public static int max(int[][] matrix) {
		int row = -1, col = -1;

		for(int i=0; i<matrix.length; i++) 
			for(int j=0; j<matrix[i].length; j++) 
				if(row == -1 || matrix[i][j] > matrix[row][col]) {
					row = i;
					col = j;
				}

		if(row != -1) 
			return matrix[row][col];

		return 0;
	}
}