package racingcar.View;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public static String carInput(){
        Output.inputCarStatement;
        return Console.readLine();
    }

    public static String tryCountInput() {
        output.printTryCountStatement();
        return Console.readLine();
    }
}
