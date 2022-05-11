import java.util.Scanner;

class Potencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nInforme um número inteiro:");

        int numeroInteiro = ler.nextInt();
        double potencia = Math.pow(numeroInteiro,5);

        System.out.println("\nResultado da potência:" + potencia);
    }
}