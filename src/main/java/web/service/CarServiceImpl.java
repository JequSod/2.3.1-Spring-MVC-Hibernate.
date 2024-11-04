package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("jigyli", 1, "V2"));
        cars.add(new Car("lada", 9, "V6"));
        cars.add(new Car("niva", 12, "V5"));
        cars.add(new Car("zaporojec", 6, "V12"));
        cars.add(new Car("aurus", 5, "V3"));
    }

    public List<Car> show(int count) {
        List<Car> newcar = new ArrayList<>();
        if (count >= cars.size()) {
            return cars;
        }
        for (int i = 0; i < count; i++) {
            newcar.add(cars.get(i));
        }
        return newcar;
    }
}


