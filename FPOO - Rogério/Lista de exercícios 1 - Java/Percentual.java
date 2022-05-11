class Percentual {
    public static void main(String[] args) {
        double valortotal = 150;
        double percentual = 5;

        double div = valortotal/100;
        double multi = div*percentual;
        double sub = valortotal-multi;

        System.out.println("Valor da compra com desconto:" + sub);
    }
}