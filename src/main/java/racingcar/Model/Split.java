package racingcar.Model;

import java.util.ArrayList;
import java.util.Collections;

public class Split {
    public ArrayList<String> splitCarName(String input){
        ArrayList<String> splitName = new ArrayList<>();
        String[] split = input.split(",");
        Collections.addAll(splitName, split);
        return splitName;
    }
}
