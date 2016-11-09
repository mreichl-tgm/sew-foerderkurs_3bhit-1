package interfaces;

interface ICanFly {
    int getSpeed();
    int getDistance();
    boolean setDistance(int distance);

    default void fly() {
        setDistance(getDistance() + getSpeed());
    }
}
