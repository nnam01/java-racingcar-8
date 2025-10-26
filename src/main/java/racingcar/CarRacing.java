package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarRacing {

    public String startCarRacing(String carNames, int n) {
        List<Car> cars = setCars(carNames);

        for (int i = 0; i < n; i++) {
            runOneCycle(cars);
            printRacingStatus(cars);
        }

        return findWinner(cars);
    }

    public void runOneCycle(List<Car> cars) {
        cars.forEach(Car::tryMoveForward);
    }

    public void printRacingStatus(List<Car> cars) {
        cars.stream().map(Car::toString).forEach(System.out::println);
        System.out.println();
    }

    public List<Car> setCars(String carNames) {
        ArrayList<Car> cars;
        String[] carNamesArray = carNames.split(",");
        cars = Arrays.stream(carNamesArray).map(Car::new).collect(Collectors.toCollection(ArrayList::new));
        return cars;
    }

    public String findWinner(List<Car> cars) {

        int maxDistance = cars.stream().mapToInt(Car::getMovingForward).filter(car -> car >= 0).max().orElse(0);

        List<String> winnerList = cars.stream().filter(car -> car.getMovingForward() == maxDistance).map(Car::getName)
                .collect(Collectors.toList());

        return String.join(", ", winnerList);
    }
}
