import java.util.Scanner;

class Modulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nInforme um número inteiro:");

        int primeiroInt = ler.nextInt();

        System.out.println("\nInforme novamente outro número inteiro:");

        int segundoInt = ler.nextInt();
        int modulo = primeiroInt % segundoInt;

        System.out.println("\nMódulo de uma divisão:" + modulo);
    }
}