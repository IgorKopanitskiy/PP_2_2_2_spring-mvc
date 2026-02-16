package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", 120, "blue"));
        cars.add(new Car("Porsche", 140, "white"));
        cars.add(new Car("Jaguar", 160, "black"));
        cars.add(new Car("Dodge", 180, "orange"));
        cars.add(new Car("Lamborghini", 200, "green"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsByCount(List<Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
