import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao sistema de cadastro de usuários!");
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Olá, " + nome + "! Vamos prosseguir com o cadastro.");
        System.out.println("Me informe seu email:");
        String email = input.nextLine();
        System.out.println("Agora, por favor, crie uma senha:");
        String password = input.nextLine();
        Usuario usuario = new Usuario(nome, email, password);
        System.out.println("Cadastro realizado com sucesso!");
    }

}