import java.util.Scanner;

class Primo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.print("\nDigite um inteiro >= 2: ");
            n = ler.nextInt();
            if (n >= 2){
                break;
            }
        }

        for (int i=2; i<n/2+1; i++){
            if (n % i == 0){
                System.out.println("\n" + n + " nao eh primo");
                System.exit(0);
            }
        }
        System.out.println("\n" + n + " eh primo");
    }
}