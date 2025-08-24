package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Midias {
    String genero;

    // Listas de músicas por gênero
    static ArrayList<String> rock = new ArrayList<>(List.of(
            "Stairway to Heaven - Led Zeppelin", "Bohemian Rhapsody - Queen", "Smoke on the Water - Deep Purple",
            "Hotel California - Eagles", "Sweet Child O’ Mine - Guns N’ Roses", "Highway to Hell - AC/DC",
            "Back in Black - AC/DC", "Smells Like Teen Spirit - Nirvana", "Born to Be Wild - Steppenwolf",
            "Another Brick in the Wall (Part 2) - Pink Floyd"
    ));

    static ArrayList<String> pop = new ArrayList<>(List.of(
            "Blinding Lights - The Weeknd", "Levitating - Dua Lipa", "Shape of You - Ed Sheeran",
            "Uptown Funk - Bruno Mars", "Bad Guy - Billie Eilish", "Senorita - Shawn Mendes & Camila Cabello",
            "Sorry - Justin Bieber", "Shake It Off - Taylor Swift", "Havana - Camila Cabello", "Roar - Katy Perry"
    ));

    static ArrayList<String> mpb = new ArrayList<>(List.of(
            "Águas de Março - Tom Jobim & Elis Regina", "Chega de Saudade - João Gilberto",
            "Tocando em Frente - Almir Sater", "Sampa - Caetano Veloso", "O Leãozinho - Caetano Veloso",
            "Cais - Milton Nascimento", "Romaria - Renato Teixeira", "Wave - Tom Jobim",
            "Garota de Ipanema - Vinícius de Moraes & Tom Jobim", "Asa Branca - Luiz Gonzaga"
    ));

    static ArrayList<String> jazz = new ArrayList<>(List.of(
            "So What - Miles Davis", "Take Five - Dave Brubeck", "Feeling Good - Nina Simone",
            "My Favorite Things - John Coltrane", "Round Midnight - Thelonious Monk", "Sing, Sing, Sing - Benny Goodman",
            "What a Wonderful World - Louis Armstrong", "All Blues - Miles Davis", "Misty - Erroll Garner",
            "Autumn Leaves - Cannonball Adderley"
    ));

    static ArrayList<String> classica = new ArrayList<>(List.of(
            "Für Elise - Beethoven", "Clair de Lune - Debussy", "Canon in D - Pachelbel", "Symphony No.5 - Beethoven",
            "The Four Seasons - Vivaldi", "Swan Lake - Tchaikovsky", "Moonlight Sonata - Beethoven",
            "Boléro - Ravel", "Ride of the Valkyries - Wagner", "Nocturne Op.9 No.2 - Chopin"
    ));

    static ArrayList<String> hiphop = new ArrayList<>(List.of(
            "Lose Yourself - Eminem", "Juicy - The Notorious B.I.G.", "Sicko Mode - Travis Scott",
            "HUMBLE. - Kendrick Lamar", "God's Plan - Drake", "N.Y. State of Mind - Nas",
            "Empire State of Mind - Jay-Z & Alicia Keys", "Hotline Bling - Drake", "All of the Lights - Kanye West",
            "C.R.E.A.M. - Wu-Tang Clan"
    ));

    static ArrayList<String> eletronica = new ArrayList<>(List.of(
            "Titanium - David Guetta ft. Sia", "Levels - Avicii", "Wake Me Up - Avicii",
            "Animals - Martin Garrix", "One More Time - Daft Punk", "Lean On - Major Lazer & DJ Snake",
            "Don't You Worry Child - Swedish House Mafia", "Scary Monsters and Nice Sprites - Skrillex",
            "Strobe - Deadmau5", "Get Lucky - Daft Punk"
    ));

    static ArrayList<String> sertanejo = new ArrayList<>(List.of(
            "Evidências - Chitãozinho & Xororó", "Atrasadinha - Felipe Araújo & Ferrugem", "Jenifer - Gabriel Diniz",
            "Romântico Anônimo - Gusttavo Lima", "Deixa - Lagum & Ana Gabriela", "Propaganda - Jorge & Mateus",
            "Quem Sabe - Sandy & Junior", "Sosseguei - Jorge & Mateus", "Infiel - Marília Mendonça",
            "Medo Bobo - Maiara & Maraisa"
    ));

    static ArrayList<String> forro = new ArrayList<>(List.of(
            "Anunciação - Alceu Valença", "Asa Branca - Luiz Gonzaga", "Xote das Meninas - Luiz Gonzaga",
            "Eu Só Quero Um Xodó - Dominguinhos", "Olha Pro Céu - Luiz Gonzaga", "Pagode Russo - Dominguinhos",
            "Riacho do Navio - Luiz Gonzaga", "Qui Nem Jiló - Luiz Gonzaga", "Esperando na Janela - Gilberto Gil",
            "Festa de São João - Trio Nordestino"
    ));

    // Construtor
    public Midias(String genero) {
        this.genero = genero;
    }

    // Ve todas as músicas
    public static void verMusicasDisponiveis(String genero) {
        System.out.println("Músicas disponíveis no gênero " + genero + ":");
        ArrayList<String> listaMusicas;

        switch (genero) {
            case "Rock": listaMusicas = rock; break;
            case "Pop": listaMusicas = pop; break;
            case "Música Popular Brasileira": listaMusicas = mpb; break;
            case "Jazz": listaMusicas = jazz; break;
            case "Música Clássica": listaMusicas = classica; break;
            case "Hip hop": listaMusicas = hiphop; break;
            case "Eletrônica": listaMusicas = eletronica; break;
            case "Sertanejo": listaMusicas = sertanejo; break;
            case "Forró": listaMusicas = forro; break;
            default:
                System.out.println("Gênero não encontrado!");
                return;
        }

        for (String musica : listaMusicas) {
            System.out.println("- " + musica);
        }
    }
    // Adicionar música ao final do gênero
    public static void adicionarMusica(String genero) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome da música que deseja adicionar ao gênero " + genero + ": ");
        String novaMusica = input.nextLine();

        if (novaMusica.isEmpty()) {
            System.out.println("É necessário adicionar uma música.");
            return;
        }

        switch (genero) {
            case "Rock": rock.add(novaMusica); break;
            case "Pop": pop.add(novaMusica); break;
            case "Música Popular Brasileira": mpb.add(novaMusica); break;
            case "Jazz": jazz.add(novaMusica); break;
            case "Música Clássica": classica.add(novaMusica); break;
            case "Hip hop": hiphop.add(novaMusica); break;
            case "Eletrônica": eletronica.add(novaMusica); break;
            case "Sertanejo": sertanejo.add(novaMusica); break;
            case "Forró": forro.add(novaMusica); break;
            default:
                System.out.println("Gênero não encontrado!");
                return;
        }

        System.out.println("Música adicionada ao final da lista do gênero " + genero + "!");
    }

    public static void removerMusica(String genero) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome da música que deseja remover da playlist: ");
        String musicaRemovida = input.nextLine();

        if (musicaRemovida.isEmpty()) {
            System.out.println("É necessário digitar o nome de uma música.");
            return;
        }

        switch (genero) {
            case "Rock": rock.remove(musicaRemovida); break;
            case "Pop": pop.remove(musicaRemovida); break;
            case "Música Popular Brasileira": mpb.remove(musicaRemovida); break;
            case "Jazz": jazz.remove(musicaRemovida); break;
            case "Música Clássica": classica.remove(musicaRemovida); break;
            case "Hip hop": hiphop.remove(musicaRemovida); break;
            case "Eletrônica": eletronica.remove(musicaRemovida); break;
            case "Sertanejo": sertanejo.remove(musicaRemovida); break;
            case "Forró": forro.remove(musicaRemovida); break;
            default:
                System.out.println("Gênero não encontrado!");
                return;
        }

        System.out.println("Música removida!");
    }


    // Getter e Setter
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}
