import javax.swing.JOptionPane;

class ConversaoCelsiusFahrenheit2 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        double celsius = Double.parseDouble(jp.showInputDialog(null, "Quantos graus em Celsius está fazendo na sua cidade hoje?"));

        jp.showMessageDialog(null, "Trocando os graus Celsius em Fahrenheit");

        double conversao = (9*celsius+160)/5;

        jp.showMessageDialog(null, "A temperatura da sua cidade de graus Celsius em Fahrenheit é:" + conversao);
    }
}