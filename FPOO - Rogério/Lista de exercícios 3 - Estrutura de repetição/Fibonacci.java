import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantidade de valores para Fibonacci?");
        int qtde = ler.nextInt();
        if(qtde < 2){
            System.out.print("1");
            System.exit(0);
        }
        long n1 = 1;
        long n2 = 1;
        System.out.print("1\t1\t");

        for(int i = 0; i < qtde - 2; i++){
            long n3 = n1 + n2;
            System.out.print(n3 + "\t");
            System.out.print("**" + (double)n2/n1 + "\t");
            n1 = n2;
            n2 = n3;
        }
    }
}