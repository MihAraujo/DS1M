import javax.swing.JOptionPane;

class QuatroOperacoes2 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        Double decimal1 = Double.parseDouble(jp.showInputDialog(null, "Informe um número decimal:"));

        Double decimal2 = Double.parseDouble(jp.showInputDialog(null, "Informe um 2° número decimal:"));

        Double adicao = decimal1 + decimal2;
        Double subtracao = decimal1 - decimal2;
        Double multiplicacao = decimal1 * decimal2;
        Double divisao = decimal1 / decimal2;

        jp.showMessageDialog(null, "Resultado da adição:" + adicao);
        jp.showMessageDialog(null, "Resultado da subtrção:" + subtracao);
        jp.showMessageDialog(null, "Resultado da multiplicação:" + multiplicacao);
        jp.showMessageDialog(null, "Resultado da divisão:" + divisao);
    }
}