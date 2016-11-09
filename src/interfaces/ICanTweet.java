package interfaces;

interface ICanTweet {
    // Predefining getters and setters can be used instead of attributes
    String getNoise();
    // Default lets you define a function body
    default void tweet() {
        System.out.println(this.getNoise());
    }
}