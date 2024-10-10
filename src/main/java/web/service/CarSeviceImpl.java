package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarSeviceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> listAllCars() {
        return carDao.listAllCars();
    }

    @Override
    public List<Car> listCarsWithCount(int count) {
        List<Car> cars = listAllCars();
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
