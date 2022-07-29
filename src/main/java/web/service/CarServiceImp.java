package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.dao.CarDao;

import java.util.List;

@Service
public class CarServiceImp implements CarService {


    private CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    public List<Car> getCarsList() {
        return carDao.getCarsList();
    }

    @Override
    public List<Car> getCarsListByLimit(String limit) {
        return carDao.getCarsListByLimit(limit);
    }
}
