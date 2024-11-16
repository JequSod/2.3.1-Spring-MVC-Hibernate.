//package web.service;
//
//import org.springframework.stereotype.Component;
//import web.model.User;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class CarServiceImpl implements CarService {
//    private List<User> cars;
//
//    {
//        cars = new ArrayList<>();
//
//        cars.add(new User("jigyli", 1, "V2"));
//        cars.add(new User("lada", 9, "V6"));
//        cars.add(new User("niva", 12, "V5"));
//        cars.add(new User("zaporojec", 6, "V12"));
//        cars.add(new User("aurus", 5, "V3"));
//    }
//
//    public List<User> show(int count) {
//        List<User> newcar = new ArrayList<>();
//        if (count >= cars.size()) {
//            return cars;
//        }
//        for (int i = 0; i < count; i++) {
//            newcar.add(cars.get(i));
//        }
//        return newcar;
//    }
//}
//
//
