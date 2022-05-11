import javax.swing.JOptionPane;

class Raiz2 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        int int1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro:"));
        double raiz1 = Math.sqrt(int1);

        jp.showMessageDialog(null, "Resultado da primeira raiz:" + raiz1);

        int int2 = Integer.parseInt(jp.showInputDialog(null, "Informe um 2° número inteiro:"));
        double raiz2 = Math.sqrt(int2);

        jp.showMessageDialog(null, "Resultado da segunda raiz:" + raiz2);
    }
}