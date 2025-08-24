package main;
import entities.*;

class ExibirDadosUsuario {
    public static void mostrar(Usuario usuario, Playlist playlist) {
        System.out.println("Dados Pessoais :");
        System.out.println("Nome do usuario : " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Sua Senha: " + usuario.getPassword());
        System.out.println("-------------------------");
        if (playlist.getNomePlaylist() == null || playlist.getNomePlaylist().trim().isEmpty()) {
            System.out.println("Você não criou uma playlist ainda.");
        } else {
            System.out.println("Nome da playlist: " + playlist.getNomePlaylist());
        }

    }
}