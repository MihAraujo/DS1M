import java.util.Scanner;

class ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos graus em Celsius está fazendo na sua cidade hoje?");
        double celsius = ler.nextDouble();

        System.out.println("---------------------------------------");
        System.out.println("Trocando os graus Celsius em Fahrenheit");
        System.out.println("---------------------------------------");

        double conversao = (9*celsius+160)/5;

        System.out.println("A temperatura da sua cidade de graus Celsius em Fahrenheit é:" + conversao);
    }
}