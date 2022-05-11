import java.util.Scanner;

class ConversaoDolarReal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nQuanto 1 dólar está valendo em Real?");
        double dolar = ler.nextDouble();

        System.out.println("\nQuantos Dólares você quer comprar?");
        double real = ler.nextDouble();

        double conversao = dolar*real;

        System.out.println("Dólar em Real igual a:" + conversao);
    }
}