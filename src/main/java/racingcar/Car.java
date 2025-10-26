package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    private int movingForward;

    public Car(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.movingForward = 0;
    }

    @Override
    public String toString() {
        return name + " : " + this.movingForwardToString();
    }

    public String movingForwardToString() {
        String moving = "";
        for (int i = 0; i < movingForward; i++) {
            moving += "-";
        }
        return moving;
    }

    public void moveForward() {
        this.movingForward++;
    }

    public void tryMoveForward() {
        int randomNum = Randoms.pickNumberInRange(0, 9);
        if (randomNum > 3) {
            this.moveForward();
        }
    }
}
