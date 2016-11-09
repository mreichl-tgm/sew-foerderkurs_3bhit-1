package interfaces;

interface ICanFly {
    // Predefining getters and setters can be used instead of attributes
    int getSpeed();
    int getDistance();
    boolean setDistance(int distance);
    // Default lets you define a function body
    default void fly() {
        setDistance(getDistance() + getSpeed());
    }
}
