import java.util.Scanner;
import java.text.DecimalFormat;

public class Matriz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		double matriz[][] = new double[2][2];
		
		for (int lin=0; lin<matriz.length; lin++) {
			for (int col=0; col<matriz[0].length; col++) {
				System.out.print("Digite um valor:");
				matriz[lin][col] = input.nextDouble();
			}
		}
		
		double media = media(matriz);
		String mediaFormatada = df.format(media);
		
		System.out.println("Média: " + df.format(media(matriz)));
		System.out.println("Menor número: " + menor(matriz));
	}
	
	// Método que calcula a média aritimética
	public static double media(double m[][]) {
		double total=0;
		for (int lin=0; lin<m.length; lin++) {
			for (int col=0; col<m[0].length; col++) {
				total+=m[lin][col];
			}
		}
		return (total / (m.length * m[0].length));
	}
	
	// Método que identifica o menor número da matriz
	public static double menor(double m[][]) {
		double menorNumero = m[0][0];
		
		for (int lin=0; lin<m.length; lin++) {
			for (int col=0; col<m[0].length; col++) {
				if (menorNumero>m[lin][col]) {
					menorNumero = m[lin][col];
				}
			}
		}
		return menorNumero;
	}
}