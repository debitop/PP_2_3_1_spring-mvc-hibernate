package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> listAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "black", 2020));
        cars.add(new Car("Kia", "white", 2014));
        cars.add(new Car("Jeep", "blue", 2018));
        cars.add(new Car("Opel", "red", 2021));
        cars.add(new Car("Mazda", "gray", 2019));
        return cars;
    }
}
