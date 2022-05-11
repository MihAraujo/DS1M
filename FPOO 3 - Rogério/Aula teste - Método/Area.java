import java.util.Scanner;

class Area{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while(true){
            while(true){
                System.out.println("Qual a figura que você deseja calcular a Area? (Quadrado/Retangulo/Circulo/Triangulo)");
                String solido = ler.next();

                double resultado = 0;

                if(solido.equals("Quadrado")){

                    System.out.println("\nInsira a medida da base do Quadrado: ");
                    double base = ler.nextDouble();
                    System.out.println("\nInsira a medida da altura do Quadrado: ");
                    double altura = ler.nextDouble();

                    resultado = squareRectangle(base, altura);
                }
                else if(solido.equals("Retangulo")){

                    System.out.println("\nInsira a medida da base do Retangulo: ");
                    double base = ler.nextDouble();
                    System.out.println("\nInsira a medida da altura do Retangulo: ");
                    double altura = ler.nextDouble();

                    resultado = squareRectangle(base, altura);
                }
                else if(solido.equals("Circulo")){

                    System.out.println("\nInsira a medida do raio do circulo: ");
                    double raio = ler.nextDouble();

                    resultado = circle(raio);
                }
                else if(solido.equals("Triangulo")){

                    System.out.println("\nInsira a medida da base do Triangulo: ");
                    double base = ler.nextDouble();
                    System.out.println("\nInsira a medida da altura do Triangulo: ");
                    double altura = ler.nextDouble();

                    resultado = triangle(base, altura);
                }
                else{
                    System.out.println("\nInsira somente as figuras dadas no ()!");
                    break;
                }

                System.out.println("\nA Area do " + solido + "é: " + resultado);
                System.exit(0);
            }
        }
    }

    public static double squareRectangle(double base, double altura){
        return (base * altura);
    }

    public static double circle(double raio){
        return (Math.pow(raio, 2) * 3.14);
    }

    public static double triangle(double base, double altura){
        return ((base * altura) / 2);
    }
}