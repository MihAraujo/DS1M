import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {

        double n1 = entrada("Digite o primeiro numero: ");
        double n2 = entrada("Digite o segundo numero: ");

        double soma = somar(n1, n2);
        double diferenca = subtrair(n1, n2);
        double produto = multiplicar(n1, n2);
        double quociente = dividir(n1, n2);

        ExibirNaTela(n1, '+', n2, soma);
        ExibirNaTela(n1, '-', n2, diferenca);
        ExibirNaTela(n1, '*', n2, produto);
        if (quociente == -1) {
            System.out.println("O segundo valor nao pode ser 0");
        }
        else {
            ExibirNaTela(n1, '/', n2, quociente);
        }
    }

    //Método ExibirNaTela
    //5.2 + 1.5 = 6.7
    public static void ExibirNaTela(double n1, char op, double n2, double resultado) {
        System.out.println(n1 + "" + op + "" + n2 + " = " + resultado);
    }

    //Método entrada
    public static double entrada(String frase) {
        Scanner ler = new Scanner(System.in);
        System.out.println(frase);
        Double numero = ler.nextDouble();
        return numero; 
    }

    //Método somar
    public static double somar(double n1, double n2){
        double soma = n1 + n2;
        return soma;
    }

    //Método subtrair
    public static double subtrair(double n1, double n2){
        return n1 - n2;
    }

    //Método multiplicar
    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    //Método dividir
    public static double dividir(double n1, double n2){
        if (n2 == 0) {
            System.out.println("\nErro de divisao por zero");
            return -1;
        }
        return n1 / n2;
    }
}