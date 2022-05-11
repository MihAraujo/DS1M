import java.util.Scanner;

class Fatoracao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while (true) {
            while (true) {
                System.out.println("Digite um positivo: ");
                int n = ler.nextInt();
                if (n == 0) {
                    System.out.println("0! = 1");
                    System.exit(0);
                }
                long fat = n;

                if (n >= 0){
                    for (int i=2; i<n; i++){
                        fat *= i;
                    }
                    System.out.println(n + "! = " + fat);
                    break;
                }
                System.out.println("** " + n + "nao eh positivo ***");
            }

            // Código adicionado
            System.out.println("\nDeseja continuar [s/n]: ");
            String op = ler.next();
            if (!op.equals("sim") && !op.equals("Sim") && !op.equals("yes") && !op.equals("Yes")) {
                System.exit(0);
            }
        }
    }
}