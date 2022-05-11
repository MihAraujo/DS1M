class Tabuada2 {
    public static void main(String[] args) {
        int n = 5;


        // Qt de tabuadas
        for (int i = 0 ; i < 3 ; i++) {
            // Construção da tabuada
            for (int j=0 ; j<=10 ; j++) {
                System.out.println(n + " x " + j + " = " + n * j);
            }
            n++;
            System.out.println();
        }
    }
}