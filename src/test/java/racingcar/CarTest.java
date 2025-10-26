package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void testToString() {
        Car car = new Car("TEST");
        assertEquals("TEST : ", car.toString());
    }

    @Test
    void moveForward_movingForwardToString() {
        Car car = new Car("TEST");
        car.moveForward();
        car.moveForward();
        car.moveForward();
        assertEquals("TEST : ---", car.toString());
    }

    @Test
    void getMovingForward() {
        Car car = new Car("TEST");
        car.moveForward();
        car.moveForward();
        int movingForward = car.getMovingForward();
        assertEquals(2, movingForward);
    }

    @Test
    void getName() {
        Car car = new Car("Test");
        String name = car.getName();
        assertEquals("Test", name);
    }

    @Test
    void 이름5자초과_에러() {
        assertThrows(IllegalArgumentException.class, () -> new Car("TestTest"));
    }
}