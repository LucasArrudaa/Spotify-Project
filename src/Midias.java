public class Midias {
    /// ○ Possui título, artista, duração e gênero.
    /// ○ Deve ser armazenada em um catálogo geral de músicas disponíveis.
    /// ○ Mídias podem ser musicas, podcasts ou audiobooks
    String NomeMusica;

    public Midias(String nomeMusica) {
        NomeMusica = nomeMusica;
    }

    public String getNomeMusica() {
        return NomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        NomeMusica = nomeMusica;
    }
}
