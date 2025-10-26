package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {

    public List<Car> findWinner(List<Car> cars) {

        int maxDistance = 0;
        for (Car car : cars) {
            if (car.getMovingForward() > maxDistance) {
                maxDistance = car.getMovingForward();
            }
        }

        List<Car> winner = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMovingForward() == maxDistance) {
                winner.add(car);
            }
        }
        return winner;
    }

}
