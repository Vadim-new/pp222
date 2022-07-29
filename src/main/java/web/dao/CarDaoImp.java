package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> listCars;

    @Override
    public void addCar(Car car) {
        listCars.add(car);
    }

    @Override
    public List<Car> getCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Жигули", "черный", 50));
        cars.add(new Car("Volvo", "red", 60));
        cars.add(new Car("Shkoda", "blue", 55));
        cars.add(new Car("Kia", "black", 70));
        cars.add(new Car("Москвич", "красный", 45));
        return cars;
    }

    @Override
    public List<Car> getCarsListByLimit(String limit) {
        int intLimit = 0;
        try {
            intLimit = Integer.parseInt(limit);
        } catch (Exception e) {
        }
        List<Car> carsByLimit = new ArrayList<>();
        List<Car> cars = getCarsList();
        for (int i = 0; i < cars.size(); i++) {
            if (intLimit <= i) break;
            carsByLimit.add(cars.get(i));
        }
        return carsByLimit;
    }
}
