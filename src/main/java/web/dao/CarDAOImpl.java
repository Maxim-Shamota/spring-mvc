package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCars(int index) {

        cars.add(new Car("BMW", "black", 7));
        cars.add(new Car("Mercedes Benz", "white", 600));
        cars.add(new Car("Volkswagen", "red", 5));
        cars.add(new Car("Audi", "blue", 80));
        cars.add(new Car("Porsche", "purple", 777));

        if (index <= 5 && index > 0) {
            return cars.subList(0, index);
        } else {
            return cars.subList(0, 5);
        }
    }
}
