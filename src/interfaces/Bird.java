package interfaces;

class Bird implements ICanTweet {
    private String noise;

    Bird(String noise) {
        this.noise = noise;
    }

    @Override
    public String getNoise() {
        return this.noise;
    }
}
