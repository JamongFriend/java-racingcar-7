package racingcar.Controllar;

import racingcar.View.InputView;
import racingcar.View.OutputView;
import racingcar.Model.Cars;

public class Controllar {
    public void racing() {
        InputView input = new InputView();
        OutputView output = new OutputView();

        output.printInputCarStatement();
        String userInput = input.carInput();
        output.printTryCountStatement();
         int tryCount = input.tryCountInput();

        Cars cars = new Cars(userInput);

        output.printResultStatement();
        for(int i=0; i<tryCount; i++){
            cars.move();
            output.carMoveResult(cars);
        }

        output.printWinner(cars.findWinner());
    }
}
