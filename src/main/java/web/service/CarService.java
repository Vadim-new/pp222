package web.service;

import web.Model.Car;

import java.util.List;

public interface CarService {

    void add(Car car);

    List<Car> listCars();

    List<Car> listCarsByLimit(int limit);
}
