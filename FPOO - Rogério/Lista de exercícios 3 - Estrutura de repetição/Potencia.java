import java.util.Scanner;

class Potencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número:");
        int base = ler.nextInt();
        System.out.println("\nDigite um expoente: ");
        int expoente = ler.nextInt();
        long conta = base;

        if(expoente == 0){
            System.out.println("\nO resultado eh 1");
            System.exit(0);
        }
        for(int i = expoente-1; i >= 1; i--){
            conta *= base;
        }
        System.out.println("\nO resultado eh: " + conta);
    }
}