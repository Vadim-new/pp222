package web.dao;

import web.Model.Car;

import java.util.List;

public interface CarDao {
    void add(Car car);

    List<Car> listCars();

    List<Car> listCarsByLimit(int limit);

}
