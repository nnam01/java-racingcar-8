package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Console.*;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        CarRacing carRacing = new CarRacing();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = Console.readLine();
        System.out.println("시도할 횟수는 몇 회인가요?");
        int n = Integer.parseInt(Console.readLine());

        List<Car> cars = carRacing.startCarRacing(carNames, n);

        System.out.println("최종 우승자 : " + cars);

    }
}
