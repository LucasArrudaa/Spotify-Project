package main;
import entities.Genero;
import entities.Midias;
import entities.Playlist;

public class VerMinhaPlaylist {
    static Genero genero;
    static Playlist playlist;
    public static void verMinhaPlaylist(Playlist getPlaylist ) {

        if (playlist.getNomePlaylist() == null || playlist.getNomePlaylist().trim().isEmpty()) { // verifica se a playlist está vazia
            System.out.println("Você não criou uma playlist ainda.");
            System.out.println("-------------------------");
        } else {
            System.out.println("Sua playlist '" + playlist.getNomePlaylist() + "' contém as seguintes músicas:");
            System.out.println("-------------------------");
            Midias.verMusicasDisponiveis(genero.getDescricao()); // lista as músicas da playlist
        }
    }

}