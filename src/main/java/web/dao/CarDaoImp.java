package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
@Component
public class CarDaoImp implements CarDao {

    private List<Car> listCars;

    @Override
    public void add(Car car) {
        listCars.add(car);
    }

    @Override
    public List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Жигули", "черный", 50));
        cars.add(new Car("Volvo", "red", 60));
        cars.add(new Car("Shkoda", "blue", 55));
        cars.add(new Car("Kia", "black", 70));
        cars.add(new Car("Москвич", "красный", 45));
        return cars;
    }

    @Override
    public List<Car> listCarsByLimit(int limit) {
        List<Car> carsByLimit = new ArrayList<>();
        List<Car> cars = listCars();
        for (int i = 0; i < cars.size(); i++) {
            if (limit <= i) break;
            carsByLimit.add(cars.get(i));
        }
        return carsByLimit;
    }
}
