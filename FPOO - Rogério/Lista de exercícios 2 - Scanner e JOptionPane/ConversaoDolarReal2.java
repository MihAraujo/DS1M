import javax.swing.JOptionPane;

class ConversaoDolarReal2 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        double dolar = Double.parseDouble(jp.showInputDialog(null, "Quanto 1 dólar está valendo em Real?"));
        double real = Double.parseDouble(jp.showInputDialog(null, "Quantos Dólares você quer comprar?"));

        double conversao = dolar*real;

        jp.showMessageDialog(null, "Dólar em Real igual a:" + conversao);
    }
}