package interfaces;

import java.util.ArrayList;

public class Main01 {
    public static void main(String[] args) {
        Fink fink = new Fink("Fink!", 20);
        Dodo dodo = new Dodo("Squawk!");
        // Possible for birds
        fink.tweet();
        dodo.tweet();
        // Not possible for a dodo
        fink.fly(20);
        // Possible because all birds can tweet
        ArrayList<ICanTweet> tweetingBirds = new ArrayList<>();
        tweetingBirds.add(fink);    // Possible because the fink is a bird
        tweetingBirds.add(dodo);    // Possible because the dodo is a bird

        for (ICanTweet b : tweetingBirds) {
            b.tweet();
        }
    }
}