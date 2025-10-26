package racingcar;


public class Car {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public Car(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
