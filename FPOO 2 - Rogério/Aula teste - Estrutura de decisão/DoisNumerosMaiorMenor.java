import java.util.Scanner;

class DoisNumerosMaiorMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite um número: ");
        int numero1 = input.nextInt();
        System.out.println("\nDigite outro número: ");
        int numero2 = input.nextInt();

        if(numero1 == numero2) {
            System.out.println(numero1 + " É igual a " + numero2);
        }
        else {
            if(numero1 < numero2) {
                System.out.println("\nO segundo é o maior");
            }
            else {
                System.out.println("\nO primeiro é o maior");
            }
        }
    }
}