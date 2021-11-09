package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarDAO carDAO;

    @Override
    public List<Car> getCars(int index) {
        return carDAO.getCars(index);
    }
}