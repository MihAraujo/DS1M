import javax.swing.JOptionPane;

class Modulo2 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        int int1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro:"));
        int int2 = Integer.parseInt(jp.showInputDialog(null, "Informe um 2° número inteiro:"));

        int modulo = int1 % int2;

        jp.showMessageDialog(null, "Módulo da divisão:" + modulo);
    }
}