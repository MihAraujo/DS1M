import java.util.Scanner;

class Raiz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nInforme um número inteiro:");

        int int1 = ler.nextInt();
        double raiz1 = Math.sqrt(int1);

        System.out.println("\nResultado da primeira raiz:" + raiz1);

        System.out.println("\nInforme novamente outro número inteiro:");

        int int2 = ler.nextInt();
        double raiz2 = Math.sqrt(int2);

        System.out.println("\nResultado da segunda raiz:" + raiz2);
    }
}