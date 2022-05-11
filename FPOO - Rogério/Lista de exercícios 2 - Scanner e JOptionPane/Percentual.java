import java.util.Scanner;

class Percentual {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nDigite o valor total da sua compra de mercado:");
        double valortotal = ler.nextDouble();

        System.out.println("\nDigite o desconto(percentual) que o mercado te deu:");
        double percentual = ler.nextDouble();

        double div = valortotal/100;
        double multi = div*percentual;
        double sub = valortotal-multi;

        System.out.println("\nCom o desconto do mercado a sua compra ficou no valor de:" + sub + " Reais");
    }
}