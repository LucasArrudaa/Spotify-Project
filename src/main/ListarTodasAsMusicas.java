package main;
import entities.*;
 class ListarTodasAsMusicas {
    public static void listar() {
        System.out.println("Músicas disponíveis no sistema:");
        Midias.verMusicasDisponiveis("Rock");
        System.out.println("-------------------------");
        Midias.verMusicasDisponiveis("Pop");
        System.out.println("-------------------------");
        Midias.verMusicasDisponiveis("Música Popular Brasileira");
        System.out.println("-------------------------");
        Midias.verMusicasDisponiveis("Jazz");
        System.out.println("-------------------------");
        Midias.verMusicasDisponiveis("Música Clássica");
        System.out.println("-------------------------");
        Midias.verMusicasDisponiveis("Hip hop");
        System.out.println("-------------------------");
        Midias.verMusicasDisponiveis("Eletrônica");
        System.out.println("-------------------------");
        Midias.verMusicasDisponiveis("Sertanejo");
        System.out.println("-------------------------");
        Midias.verMusicasDisponiveis("Forró");
        System.out.println("-------------------------");
    }
}
