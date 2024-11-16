package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService carService;

    @Autowired
    public CarsController(UserService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") Integer count, Model car) {

        car.addAttribute("cars", carService.show(count));
        return "cars";
    }
}
