package racingcar.View;

import racingcar.Model.Car;
import racingcar.Model.Cars;
import java.util.List;

public class OutputView {
    private static final String MOVEDISTANCE = "-";
    private static final String COLON = ": ";
    public static final String COMMA = ", ";
    private static final String inputCarStatement = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String tryCountStatement = "시도할 횟수는 몇 회인가요?";
    private static final String resultStatement = "실행 결과";
    private static final String winnerStatement = "최종 우승자 : ";

    public void printInputCarStatement() {
        System.out.println(inputCarStatement);
    }

    public void printTryCountStatement() {
        System.out.println(tryCountStatement);
    }

    public void printResultStatement() {
        System.out.println(resultStatement);
    }

    public void carMoveResult(Cars cars){
        for(Car car : cars.getCars())
            System.out.println(car.getName() + COLON + MOVEDISTANCE.repeat(car.getPosition()));
    };
    public void printWinner(List<String> winners){
        System.out.println(winnerStatement + COLON+ String.join(COMMA, winners));
    }
}
