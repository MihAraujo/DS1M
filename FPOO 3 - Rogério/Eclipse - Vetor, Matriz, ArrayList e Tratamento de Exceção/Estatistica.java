
public class Estatistica {
	public static void main(String[] args) {
		
		double numeros[] = new double[args.length];
		
		for (int i = 0; i < args.length; i++) {
			numeros[i] = Double.parseDouble(args[i]);
		}
		
		System.out.println("Média: " + media(numeros));
		System.out.println("Menor número: " + menor(numeros));
		System.out.println("Maior número: " + maior(numeros));
		
	}
	public static double media(double vet[]) {
		double total = 0;
		for (int i = 0; i < vet.length; i++) {
			total += vet[i];
		}
		return total / vet.length;
	}
	public static double menor(double vetor[]) {
		double menorNumero = vetor[0];
		for (int i = 1; i<vetor.length; i++) {
			if (menorNumero > vetor[i]) {
				menorNumero = vetor[i];
			}
		}
		return menorNumero;
	}
	public static double maior(double vetor[]) {
		double maiorNumero = vetor[0];
		for (int i = 1; i<vetor.length; i++) {
			if (maiorNumero > vetor[i]) {
				maiorNumero = vetor[i];
			}
		}
		return maiorNumero;
	}
}
