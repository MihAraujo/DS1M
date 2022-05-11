import java.util.Scanner;

class Fatoracao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true){
            System.out.println("Informe um número positivo: ");
            int n = ler.nextInt();
                if( n == 0 ){
                    System.out.println("0! = 1");
                    System.exit(0);
                }

            long fat = n;

            if( n >= 0 ){
                for (int i=2; i<n; i++){
                    fat *= i;
                }
                System.out.println(n + "! = " + fat);
                System.exit(0);
            }
            System.out.println("Número negativo, repita.");
        }
    }
}