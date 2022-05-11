import java.util.Scanner;

class TrocaDeVariaveis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Lembre-se, a Variável 1 é 10 e a Variável 2 é 4");

        System.out.println("\nDigite o número 10:");
        int variavel1 = ler.nextInt();

        System.out.println("\nDigite o número 4:");
        int variavel2 = ler.nextInt();

        System.out.println("\nDigite o número 0:");
        int variavel3 = ler.nextInt();

        System.out.println("------------------");
        System.out.println("Trocando variáveis");
        System.out.println("------------------");

        variavel3 = variavel1;
        variavel1 = variavel2;
        variavel2 = variavel3;

        System.out.println("variável 1:" + variavel1);
        System.out.println("variável 2:" + variavel2);
    }
}