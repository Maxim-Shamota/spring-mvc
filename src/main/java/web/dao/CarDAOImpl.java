package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars = new ArrayList<>();

    public CarDAOImpl() {
        cars.add(new Car("BMW", "black", 7));
        cars.add(new Car("Mercedes Benz", "white", 600));
        cars.add(new Car("Volkswagen", "red", 5));
        cars.add(new Car("Audi", "blue", 80));
        cars.add(new Car("Porsche", "purple", 777));
    }

    @Override
    public List<Car> get(int index) {

        if (index <= 5 && index > 0) {
            return cars.subList(0, index);
        }
        return cars.subList(0, 5);
    }
}
