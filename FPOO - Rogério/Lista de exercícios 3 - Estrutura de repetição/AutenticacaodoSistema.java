import java.util.Scanner;

class AutenticacaodoSistema {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String login = "MilenaLinda";
        String senha = "Mit@123#";
        int rep = 1;

        while(rep < 4){
            for (int i = 1; i <= 3; i++){

                System.out.println("\nDigite o seu login: ");
                String usuario = ler.next();
                System.out.println("\nDigite sua senha:");
                String senhaInserida = ler.next();

                if(usuario.equals(login) && senhaInserida.equals(senha)){
                    System.out.println("\nSeja bem-vindo(a)!");
                    break;
                }
                else{
                    System.out.println("\nLogin e/ou senha incorreto, digite novamente!");
                    rep ++;
                }
            }
            System.exit(0);
        }
    }
} 