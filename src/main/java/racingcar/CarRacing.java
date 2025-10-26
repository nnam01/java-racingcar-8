package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {

    public List<Car> startCarRacing(String carNames, int n) {
        List<Car> cars = setCars(carNames);

        for (int i = 0; i < n; i++) {
            runOneCycle(cars);
            printRacingStatus(cars);
        }

        return findWinner(cars);
    }

    public void runOneCycle(List<Car> cars) {
        for (Car car : cars) {
            car.tryMoveForward();
        }
    }

    public void printRacingStatus(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println();
    }

    public List<Car> setCars(String carNames) {
        List<Car> cars = new ArrayList<>();

        String[] carNamesArray = carNames.split(",");
        for (String s : carNamesArray) {
            cars.add(new Car(s));
        }
        return cars;
    }

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
