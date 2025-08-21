import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(System.in);
            System.out.println("Seja bem-vindo ao sistema de cadastro de usuários!");
            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();
            while (nome.trim().isEmpty()) // verifica se o nome está vazio
            {
                System.out.println("Nome inválido. Por favor, insira um nome válido:");
                nome = input.nextLine();
            }

            System.out.println("Olá, " + nome + "! Vamos prosseguir com o cadastro.");
            System.out.println("Me informe seu email:");
            String email = input.nextLine();
            while (!email.contains("@") || !email.contains(".")) {
                System.out.println("Email inválido. Por favor, insira um email válido:");
                email = input.nextLine();
            }

            System.out.println("Agora, por favor, crie uma senha:");
            String password = input.nextLine();
            while (password.length() < 6) {
                System.out.println("Senha muito curta. A senha deve ter pelo menos 6 caracteres. Tente novamente:");
                password = input.nextLine();
            }

            Usuario usuario = new Usuario(nome, email, password);
            System.out.println("Cadastro realizado com sucesso!"+
                               "\nNome: " + usuario.getNome() +
                               "\nEmail: " + usuario.getEmail());

            //

            System.out.println("Vamos criar sua playlist.");
            System.out.print("Digite o nome da sua playlist: ");
            String nomePlaylist = input.nextLine();
            Playlist playlist = new Playlist(nomePlaylist);
            while (playlist.getNomePlaylist().trim().isEmpty()) {
                System.out.println("Nome da playlist inválido. Por favor, insira um nome válido:");
                nomePlaylist = input.nextLine();
                playlist.setNomePlaylist(nomePlaylist);
            }
            // genero da playlist
            System.out.println("Agora, escolha o gênero da sua playlist:");
            Genero genero = Genero.escolherGenero(input);
            System.out.println("Gênero escolhido: " + genero.getDescricao() + " - " + genero.getCaracterista());

            System.out.println("Playlist '" + playlist.getNomePlaylist() + "' criada com sucesso!");


            // 🔄 LOOP DO MENU COM WHILE
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("\nMenu do Spotify:");
                System.out.println("1. Ver músicas disponíveis na plataforma");
                System.out.println("2. Adicionar música à sua playlist");
                System.out.println("3. Remover música da sua playlist");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = input.nextInt();
                input.nextLine(); // limpar o buffer

while (opcao < 1 || opcao > 4) {
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4:");
                    opcao = input.nextInt();
                    input.nextLine(); // Limpar o buffer do scanner após a leitura do inteiro
                }
                switch (opcao) {
                    case 1:
                        System.out.println("Músicas disponíveis na plataforma:");
                        // aqui deve listar as músicas disponíveis
                        break;

                    case 2:
                        System.out.println("Adicionar música a sua playlist:");
                        // aqui deve listar as músicas disponíveis
                        System.out.print("Digite o nome da música que deseja adicionar: ");
                        String nomeMusicaAdicionar = input.nextLine();
                        System.out.println("Música '" + nomeMusicaAdicionar + "' adicionada à playlist '" + playlist.getNomePlaylist() + "' com sucesso!");
                        break;

                    case 3:
                        System.out.println("Remover música da sua playlist:");
                        // aqui deve listar as músicas na playlist
                        System.out.print("Digite o nome da música que deseja remover: ");
                        String nomeMusicaRemover = input.nextLine();
                        System.out.println("Música '" + nomeMusicaRemover + "' removida da playlist '" + playlist.getNomePlaylist() + "' com sucesso!");
                        break;
                    case 4:
                        System.out.println("Saindo do sistema. Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }

    }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            System.out.println("Obrigado por usar o sistema de cadastro de usuários!");
        }
    }
}