import java.util.Scanner;

public class cadastroDeUsuario {
    public static void main (String[] args){

        System.out.println("Bem-vindo a sua agenda\nPara continuar faça seu cadastro:");

        // Cadastro de novo cliente.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nomeNovoUsuario = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenomeNovoCliente = scanner.nextLine();

        System.out.print("Email: ");
        String emailNovoUsuario = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefoneNovoUsuario = scanner.nextLine();

        System.out.print("Senha: ");
        String senhaNovoUsuario = scanner.nextLine();

        System.out.print("Confirme sua senha: ");
        String senhaNovoUsuarioConfirmacao = scanner.nextLine();

        while (!senhaNovoUsuario.equals(senhaNovoUsuarioConfirmacao)) {
            System.out.println("Senhas diferentes. Tente novamente.");

            System.out.print("Senha: ");
            String senhaNovoUsuario2 = scanner.nextLine();

            System.out.print("Confirme sua senha: ");
            String senhaNovoUsuarioConfirmacao2 = scanner.nextLine();

            if (senhaNovoUsuario2.equals(senhaNovoUsuarioConfirmacao2)) {
                senhaNovoUsuario = senhaNovoUsuario2;
                senhaNovoUsuarioConfirmacao = senhaNovoUsuarioConfirmacao2;
                break;
            }
        }
        System.out.println(senhaNovoUsuario);
    }
}

