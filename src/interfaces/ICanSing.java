package interfaces;

import java.util.Random;

public interface ICanSing extends ICanTweet {
    Random rand = new Random();

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