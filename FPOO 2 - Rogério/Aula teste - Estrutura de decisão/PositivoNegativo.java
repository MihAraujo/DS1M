import java.util.Scanner;

class PositivoNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite um número: ");
        int numero = input.nextInt();
        if(numero == 0) {
            System.out.println(numero + " Zero");
        }
        else {
            if(numero < 0) {
                System.out.println(numero + " Negativo");
            }
            else {
                System.out.println(numero + " Positivo");
            }
        }
    }
}