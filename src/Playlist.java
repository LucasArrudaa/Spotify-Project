public class Playlist {
///○ Possui um nome e pertence a um único usuário.
/// ○ Contém uma lista de músicas
/// ○ Pode calcular a duração total da playlist.{

    String nomePlaylist;

    public Playlist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }
}
