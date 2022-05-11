import java.util.Scanner;

class QuatroOperacoes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nInforme um 1° número decimal:");
        Double numerodecimal1 = ler.nextDouble();

        System.out.println("\nInforme um 2° número decimal:");
        Double numerodecimal2 = ler.nextDouble();
        Double adicao = numerodecimal1 + numerodecimal2;

        System.out.println("\n\tResultado da adição:" + adicao);


        System.out.println("\nInforme um 1° número decimal:");
        numerodecimal1 = ler.nextDouble();

        System.out.println("\nInforme um 2° número decimal:");
        numerodecimal2 = ler.nextDouble();
        Double subtracao = numerodecimal1 - numerodecimal2;

        System.out.println("\n\tResultado da subtração:" + subtracao);


        System.out.println("\nInforme um 1° número decimal:");
        numerodecimal1 = ler.nextDouble();

        System.out.println("\nInforme um 2° número decimal:");
        numerodecimal2 = ler.nextDouble();
        Double multiplicacao = numerodecimal1 * numerodecimal2;

        System.out.println("\n\tResultado da multiplicação:" + multiplicacao);


        System.out.println("\nInforme um 1° número decimal:");
        numerodecimal1 = ler.nextDouble();

        System.out.println("\nInforme um 2° número decimal:");
        numerodecimal2 = ler.nextDouble();
        Double divisao = numerodecimal1 / numerodecimal2;

        System.out.println("\n\tResultado da divisão:" + divisao);
    }
}