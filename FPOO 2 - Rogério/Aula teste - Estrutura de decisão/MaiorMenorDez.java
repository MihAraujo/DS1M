import java.util.Scanner;

class MaiorMenorDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite um número: ");
        int numero = input.nextInt();
        if(numero == 10) {
            System.out.println(numero + " Dez");
        }
        else {
            if(numero < 10) {
                System.out.println(numero + " Menor que dez");
            }
            else {
                System.out.println(numero + " Maior que dez");
            }
        }
    }
}