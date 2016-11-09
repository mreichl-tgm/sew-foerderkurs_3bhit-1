package interfaces;

import java.util.Random;

interface ICanSing extends ICanTweet {
    // Variables have to be instantiated inside an interface
    Random rand = new Random();
    // Default lets you define a function body
    @Override
    default void tweet() {
        String tweet = getNoise().toLowerCase();
        String song = "";

        for (int i = 0; i < tweet.length(); i++) {
            if (rand.nextBoolean()) {
                song += tweet.toUpperCase().charAt(i);
            } else {
                song += tweet.charAt(i);
            }
        }

        System.out.println(song);
    }
}