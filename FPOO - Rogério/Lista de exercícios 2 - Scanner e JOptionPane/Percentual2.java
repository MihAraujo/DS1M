import javax.swing.JOptionPane;

class Percentual2 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        double valortotal = Double.parseDouble(jp.showInputDialog(null, "Digite o valor total da sua compra de mercado:"));

        double percentual = Double.parseDouble(jp.showInputDialog(null, "Digite o desconto(percentual) que o mercado te deu: "));

        double div = valortotal/100;
        double multi = div*percentual;
        double sub = valortotal-multi;

        jp.showMessageDialog(null, "Com o desconto do mercado a sua compra ficou no valor de:" + sub + " Reais");
    }
}