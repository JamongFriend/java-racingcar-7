package racingcar.View;

import racingcar.Model.Car;

public class OutputView {
    public static final char moveDistance = '-';
    public static final char colon = ':';
    public static final char comma = ',';
    public static final String inputCarStatement = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String tryCountStatement = "시도할 횟수는 몇 회인가요?";
    public static final String resultStatement = "실행 결과";
    public static final String winnerStatement = "최종 우승자 : ";

    public void carMoveResult(){
        for(Car car : cars) {
            System.out.println(car.getName() + "");
        }
    };
}
