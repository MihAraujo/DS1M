import java.util.Scanner;

class Divisao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nInforme um número intiero:");

        int numeroInteiro1 = ler.nextInt();

        System.out.println("\nInforme novamente outro número inteiro:");

        int numeroInteiro2 = ler.nextInt();
        int divisao = numeroInteiro1 / numeroInteiro2;

        System.out.println("\nResultado da divisão:" + divisao);
    }
}