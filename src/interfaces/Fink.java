package interfaces;

class Fink extends Bird implements ICanFly, ICanSing {
    private int speed;
    private int distance;

    Fink(String noise, int speed) {
        super(noise);

        this.speed = speed;
        this.distance = 0;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getDistance() {
        return this.distance;
    }

    @Override
    public boolean setDistance(int distance) {
        this.distance = distance;
        return true;
    }

    void fly(int time) {
        for (int i = 0; i < time; i++) {
            fly();
        }
    }
}