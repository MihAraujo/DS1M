
public class Matriz2 {
	public static void main(String[] args) {
		double a[][] = {{1, 8}, {2, 0}};
		double b[][] = {{-7, 2}, {4, -8}};
		double c[][] = new double [2][2];
		
		for (int linha = 0; linha < a.length; linha++) {
			for (int coluna = 0; coluna < b.length; coluna++) {
				c[linha][coluna] = a[linha][coluna] + b[linha][coluna];
			}
		}
	}
}
