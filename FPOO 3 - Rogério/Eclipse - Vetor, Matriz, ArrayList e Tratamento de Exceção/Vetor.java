import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double notas[] = new double[4];
		
		for (int i=0; i<notas.length; i++) {
			System.out.print((i+1)+ "ª nota: ");
			notas[i] = ler.nextDouble();
		}
		System.out.println(notas[5]);
		
		double somaNotas = 0;
		
		for (int i=0; i<notas.length; i++) {
			System.out.println((i+1) + "ª nota: " + notas[i]);
			somaNotas = somaNotas + notas[i];
		}
		
		double media = somaNotas / notas.length;
		System.out.println("\nMédia: " + ss);
	}
}
