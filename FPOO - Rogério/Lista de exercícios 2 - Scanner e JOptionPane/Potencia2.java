import javax.swing.JOptionPane;

class Potencia2 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        int int1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro:"));

        double potencia = Math.pow(int1, 5);

        jp.showMessageDialog(null, "Resultado da potência com expoente 5:" + potencia);
    }
}