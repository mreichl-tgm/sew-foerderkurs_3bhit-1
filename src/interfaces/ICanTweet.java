package interfaces;

interface ICanTweet {
    String getNoise();

    default void tweet() {
        System.out.println(this.getNoise());
    }
}