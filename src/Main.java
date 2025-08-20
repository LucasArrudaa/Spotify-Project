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
        input.close();
    }
// menu do Spotify
    public static void menu() {
        System.out.println("1. Ver músicas");
        System.out.println("2. Adicionar música");
        System.out.println("3. Remover música");
        System.out.println("4. Criar playlist");
        System.out.println("5. Sair");
    }


}