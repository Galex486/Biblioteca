import java.util.*;
public class Main {
    public static void main(String[] args) {
        Biblioteca<Media<Carte>> bibliotecaCarti = new Biblioteca<>(5);
        bibliotecaCarti.adaugaMedia(new Media<>(new Carte("Cronicile din Narnia")));
        bibliotecaCarti.adaugaMedia(new Media<>(new Carte("Harry Potter")));

        Biblioteca<Media<Video>> bibliotecaVideo = new Biblioteca<>(3);
        bibliotecaVideo.adaugaMedia(new Media<>(new Video("The Matrix")));

        Biblioteca<Media<Ziar>> bibliotecaZiare = new Biblioteca<>(4);
        bibliotecaZiare.adaugaMedia(new Media<>(new Ziar("New York Times")));
        bibliotecaZiare.adaugaMedia(new Media<>(new Ziar("The Guardian")));

        bibliotecaCarti.afiseazaContinut();
        bibliotecaVideo.afiseazaContinut();
        bibliotecaZiare.afiseazaContinut();
    }
}