package generics;

public class MainGenerics {
    public static void main(String[] args) {
        ClassicalArtist mozart = new ClassicalArtist("Mozart");
        ClassicalArtist chopin = new ClassicalArtist("Chopin");

        mozart.addSong("requiem in d");
        chopin.addSong("op. 64 no. 2 in c-sharp minor");

        Duet<ClassicalArtist> bd = new Duet<>(mozart, chopin);

        bd.playSongs();
        bd.getNames();
    }
}
