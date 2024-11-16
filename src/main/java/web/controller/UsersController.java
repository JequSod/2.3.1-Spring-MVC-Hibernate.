package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showAllUser(Model model) {
        List<User> allUser = userService.getAllUser();
        model.addAttribute("AllUSE", allUser);
        return "All-users";
    }

    @GetMapping("/save")
    public String save(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user-add";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/updateUser")
    public String updateUser(@RequestParam("id") long id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user-add";
    }

    @GetMapping("/deleteUser")
    public String removeUser(@RequestParam("id") long id) {
        userService.removeUser(id);
        return "redirect:/";
    }
}
