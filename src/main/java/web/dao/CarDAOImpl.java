package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    @Override
    public List<Car> getCars(int index) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "black", 7));
        cars.add(new Car("Mercedes Benz", "white", 600));
        cars.add(new Car("Volkswagen", "red", 5));
        cars.add(new Car("Audi", "blue", 80));
        cars.add(new Car("Porsche", "purple", 777));
        for (int i = 4; i > (index - 1); i--) {
            cars.remove(i);
        }
        return cars;
    }
}
