import javax.swing.JOptionPane;

class Teste2 {
    public static void main(String[] args) {
        JOptionPane jp = new JOptionPane();

        int AnoNascInt = Integer.parseInt(jp.showInputDialog (null, "Ano de nascimento?"));

        int idade = 2022 - AnoNascInt;
        
        jp.showMessageDialog (null, "Idade:" + idade + " anos.");
    }
}