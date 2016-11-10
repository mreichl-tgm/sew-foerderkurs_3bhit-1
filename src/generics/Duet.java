package generics;

class Duet<T extends Artist> {
    private T a1;
    private T a2;

    Duet(T a1, T a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    void playSongs() {
        a1.playSongs();
        a2.playSongs();
    }

    void getNames() {
        System.out.println(a1.getName());
        System.out.println(a2.getName());
    }
}
