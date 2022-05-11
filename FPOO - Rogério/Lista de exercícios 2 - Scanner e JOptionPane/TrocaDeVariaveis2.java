import javax.swing.JOptionPane;

class TrocaDeVariaveis2 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        int variavel1 = Integer.parseInt(jp.showInputDialog (null, "Digite um número: "));
        int variavel2 = Integer.parseInt(jp.showInputDialog (null, "Digite outro número: "));
        jp.showMessageDialog(null, "Lembre-se, a Variável 1 é " + variavel1 + " e a Variável 2 é " + variavel2);

        int variavel3 = variavel1;
        variavel1 = variavel2;
        variavel2 = variavel3;

        jp.showMessageDialog(null, "Trocando variáveis");

        jp.showMessageDialog(null, "variável 1: " + variavel1);
        jp.showMessageDialog(null, "variável 2: " + variavel2);
    } 
}