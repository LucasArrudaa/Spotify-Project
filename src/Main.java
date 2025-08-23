import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
            // genero da playlist
            System.out.println("\n Agora, escolha o gênero da sua playlist:");
            Genero genero = Genero.escolherGenero(input);
            System.out.println("Gênero escolhido: " + genero.getDescricao() + " - " + genero.getCaracterista());

            System.out.println("Playlist '" + playlist.getNomePlaylist() + "' criada com sucesso!");

            // feito o cadastro e criado o objeto usuario
            Usuario usuario = new Usuario(nome, email, password,nomePlaylist);
            System.out.println("Cadastro realizado com sucesso!"+
                    "\nNome: " + usuario.getNome() +
                    "\nEmail: " + usuario.getEmail());
            //  LOOP DO MENU COM WHILE
            int opcao = 0;

            while (opcao != 6) {
                System.out.println("\nMenu do Spotify:");
                System.out.println("1. Ver músicas disponíveis na plataforma");
                System.out.println("2. Adicionar música à sua playlist");
                System.out.println("3. Remover música da sua playlist");
                System.out.println("4. Ver minha playlist");
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
                    case 1: // ver músicas disponíveis
                        System.out.println("De qual genêro você gostaria de ver as músicas?");
                        Genero escolha = Genero.escolherGenero(input);
                        System.out.println("Gênero escolhido: " + escolha.getDescricao() + " - " + escolha.getCaracterista()); // lista o gênero escolhido
                        System.out.println("Músicas disponíveis na plataforma no genero "+ escolha.getDescricao());
                        Midias.verMusicasDisponiveis(genero.getDescricao());
                        break;

                    case 2: // adicionar música
                        System.out.println("Adicionar música a sua playlist:");
                        // aqui deve listar as músicas disponíveis
                        System.out.println("Música adicionada à playlist '" + playlist.getNomePlaylist() + "' com sucesso!");
                        Midias.adicionarMusica(genero.getDescricao()); // digite uma música
                        break;

                    case 3: // remover música
                        System.out.println("Remover música da sua playlist:");
                        // aqui deve listar as músicas na playlist
                        Midias removendoMusicaPlaylist = new Midias(genero.getDescricao());
                        Midias.removerMusica(genero.getDescricao());
                        System.out.println("Música removida da playlist '" + playlist.getNomePlaylist() + "' com sucesso!");
                        break;

                    case 4: // ver minha playlist
                        System.out.println("Sua playlist '" + playlist.getNomePlaylist() + "' contém as seguintes músicas:");
                        // aqui deve listar as músicas na playlist do usuário
                        break;

                    case 5: // ver meus dados
                        System.out.println("Seus dados:");
                        System.out.println("Nome: " + usuario.getNome());
                        System.out.println("Email: " + usuario.getEmail());
                        System.out.println("Senha: " + usuario.getPassword());
                        if (playlist.getNomePlaylist() == null || playlist.getNomePlaylist().trim().isEmpty()) { // verifica se a playlist está vazia
                            System.out.println("Você não criou uma playlist ainda.");
                        } else {
                            System.out.println("Nome da playlist: " + playlist.getNomePlaylist());
                        }

                        break;
                    case 6: // sair
                        System.out.println("SAINDO...");
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