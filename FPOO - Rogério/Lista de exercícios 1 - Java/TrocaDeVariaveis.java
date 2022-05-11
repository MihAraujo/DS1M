class TrocaDeVariaveis {
    public static void main(String[] args) {
        int variavel1 = 10;
        int variavel2 = 4;
        int variavel3 = 0;

        System.out.println("variável1:" + variavel1);
        System.out.println("variável2:" + variavel2);

        System.out.println("------------------");
        System.out.println("Trocando variáveis");
        System.out.println("------------------");
        
        variavel3 = variavel1;
        variavel1 = variavel2;
        variavel2 = variavel3;

        System.out.println("variável1:" + variavel1);
        System.out.println("variável2:" + variavel2);
    }
}