package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getAllCars();

    public List<Car> getCarsByCount(List<Car> cars, int count);
}
