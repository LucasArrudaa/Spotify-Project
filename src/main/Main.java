package main;
import entities.*; // importando todas as classes do pacote entities
import java.util.Scanner;


public class Main {
    public static void main() {

        try {
            // Inicio do sistema e cadastro do usuário
            Scanner input = new Scanner(System.in);
            System.out.println("Seja bem-vindo ao sistema de cadastro de usuários!");
            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();
            while (nome.trim().isEmpty()) // verifica se o nome está vazio
            {
                System.out.println("Nome inválido. Por favor, insira um nome válido:");
                nome = input.nextLine();
            }
            // cadastro do email
            System.out.println("Olá, " + nome + "! Vamos prosseguir com o cadastro.");
            System.out.println("Me informe seu email:");
            String email = input.nextLine();
            while (!email.contains("@") || !email.contains(".")) {
                System.out.println("Email inválido. Por favor, insira um email válido:");
                email = input.nextLine();
            }
            // cadastro da senha
            System.out.println("Agora, por favor, crie uma senha:");
            String password = input.nextLine();
            while (password.length() < 6) {
                System.out.println("Senha muito curta. A senha deve ter pelo menos 6 caracteres. Tente novamente:");
                password = input.nextLine();
            }

            // criação da playlist

            System.out.println("Vamos criar sua playlist.");
            System.out.print("Digite o nome da sua playlist: ");
            String nomePlaylist = input.nextLine();
            Playlist playlist = new Playlist(nomePlaylist);
            while (playlist.getNomePlaylist().trim().isEmpty()) {
                System.out.println("Nome da playlist inválido. Por favor, insira um nome válido:");
                nomePlaylist = input.nextLine();
                playlist.setNomePlaylist(nomePlaylist);

            }


            System.out.println("entities.Playlist '" + playlist.getNomePlaylist() + "' criada com sucesso!");

            // feito o cadastro e criado o objeto usuario
            Usuario usuario = new Usuario(nome, email, password,nomePlaylist);
            System.out.println("Cadastro realizado com sucesso!"+
                    "\nNome: " + usuario.getNome() +
                    "\nEmail: " + usuario.getEmail());


            //  LOOP DO MENU COM WHILE
            int opcao = 0;

            while (opcao != 6) {
                System.out.println("\nMenu do Spotify:");
                System.out.println("1. Ver todas as músicas disponíveis na plataforma"); // falta numerar as posições das músicas
                System.out.println("2. Adicionar música à sua playlist"); // ta quebrando pq n tem playlist criada / falta numerar as posições das músicas por genero
                System.out.println("3. Remover música da sua playlist"); // ta quebrando pq n tem playlist criada / falta numerar as posições das músicas da playlist
                System.out.println("4. Ver minha playlist"); // ta quebrando pq n tem playlist criada
                System.out.println("5. Ver meus dados");
                System.out.println("6. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = input.nextInt();
                input.nextLine(); // limpar o buffer

                while (opcao < 1 || opcao > 6) { // validação da opção
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4:");
                    opcao = input.nextInt();
                    input.nextLine();
                }
                switch (opcao) {
                    case 1:  // Listar Todas as músicas
                        ListarTodasAsMusicas.listar();
                        break;

                    case 2: // Adicionar Musicas

                        break;

                    case 3: // Remover Musicas
                        RemoverMusica.remover(playlist); // chama o método para remover músicas da playlist
                        break;

                    case 4: // Ver Minha Playlist
                        VerMinhaPlaylist.verMinhaPlaylist(playlist); // chama o método para ver a playlist
                        break;

                    case 5: // Exibir Dados do Usuário
                      ExibirDados.mostrar(usuario, playlist);  // chama o método para exibir os dados do usuário
                        break;

                    case 6: // Saindo do sistema
                      SaindoDoSistema.saindo();
                        break;

                    default: // caso a opção seja inválida
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            }
        } catch (Exception e) { // captura qualquer erro inesperado

            System.out.println("Ocorreu um erro: " + e.getMessage());

        } finally { // bloco que sempre será executado
            System.out.println("Até logo !");
        }
    }
}