import java.util.Scanner;

class MaiorMenor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nInforme sua idade: ");
        int idade = ler.nextInt();

        if (idade > 17) {
            System.out.println("\nMaior de idade, entrada permitida\n");
        }
        else {
            System.out.println("\nMenor de idade, entrada proibida\n");
        }
    }
}