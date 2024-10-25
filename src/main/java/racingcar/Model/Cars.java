package racingcar.Model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars = new ArrayList<>();

    public Cars(String input){
        List<String> carsName = List.of(input.split(","));
        setCar(carsName);
    }

    private void setCar(List<String> carNames){
        for(String carName : carNames) {
            if(carName.length() > 5)
                throw new IllegalArgumentException("자동차의 이름은 5자 이내 이어야 합니다: " + carName);
            this.cars.add(new Car(carName));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void move(){
        for(Car car : cars) {
            int randomNum = Randoms.pickNumberInRange(0, 9);
            if (randomNum >= 4) {
                car.moveForward();
            }
        }
    }

    public List<String> findWinner(){
        int maxPosition = cars.stream().mapToInt(Car::getPosition).max().orElse(0);

        List<String> winnerCar = new ArrayList<>();
        for(Car car : cars){
            if(car.getPosition() == maxPosition){
                winnerCar.add(car.getName());
            }
        }
        return winnerCar;
    }

    public void getWinner(){
        List<String> winners = findWinner();
        System.out.println("우승자: " + String.join(", ", winners));
    }
}
