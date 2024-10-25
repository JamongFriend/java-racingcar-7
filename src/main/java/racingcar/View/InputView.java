package racingcar.View;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String carInput(){
        return Console.readLine();
    }

    public int tryCountInput() {
        return Integer.parseInt(Console.readLine());
    }
}
