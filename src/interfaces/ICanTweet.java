package interfaces;

interface ICanTweet {
    String getNoise();

    default void tweet() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getNoise());
        }
    }
}