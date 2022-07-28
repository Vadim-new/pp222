package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Model.Car;
import web.dao.CarDao;

import java.util.List;

@Service
@Component
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;


    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }

    @Override
    public List<Car> listCarsByLimit(int limit) {
        return carDao.listCarsByLimit(limit);
    }
}
