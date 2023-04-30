/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;
        
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Jesus Alberto
 */
public class MusicPlayer {


    private LinkedList<String> playlist;
    private ListIterator<String> playlistIterator;
    private String currentSong;

    public MusicPlayer(){
        playlist = new LinkedList<String>();
        playlistIterator = playlist.listIterator();
        currentSong = "";
    }

    public void addSong(String song) {
        playlist.add(song);
    }

    public void play() {
        if (playlist.isEmpty()) {
            System.out.println("La lista de reproducción está vacía.");
        } else {
            if (currentSong.isEmpty()) {
                playlistIterator.next();
                currentSong = playlistIterator.previous();
            }
            System.out.println("Reproduciendo: " + currentSong);
        }
    }

    public void nextSong() {
        if (playlistIterator.hasNext()) {
            currentSong = playlistIterator.next();
            System.out.println("Siguiente canción: " + currentSong);
        } else {
            System.out.println("Fin de la lista de reproducción.");
        }
    }

    public void previousSong() {
        if (playlistIterator.hasPrevious()) {
            currentSong = playlistIterator.previous();
            System.out.println("Canción anterior: " + currentSong);
        } else {
            System.out.println("Inicio de la lista de reproducción.");
        }
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.addSong("Canción 1");
        player.addSong("Canción 2");
        player.addSong("Canción 3");
        player.play();
        player.nextSong();
        player.nextSong();
        player.previousSong();
    }
}

    

