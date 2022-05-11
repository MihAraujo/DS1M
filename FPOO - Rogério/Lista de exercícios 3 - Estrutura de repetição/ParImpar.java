import java.util.Scanner;

class ParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while(true){
            System.out.println("\nInforme um numero:");
            int num = ler.nextInt();

            int res = num % 2;
            if (res == 0) {
                System.out.println("\nPar");
            }
            else {
                System.out.println("\nImpar");
            }
            // Código adicionado
            System.out.println("\nDeseja continuar [sim/não]: ");
            String op = ler.next();
            if (!op.equals("sim") && !op.equals("Sim") && !op.equals("yes") && !op.equals("Yes")) {
                System.exit(0);
            }
        }
    }
}