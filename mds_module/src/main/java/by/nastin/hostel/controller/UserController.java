package by.nastin.hostel.controller;


import by.nastin.hostel.entity.User;
import by.nastin.hostel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/mds/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public User create(@Valid @RequestBody User user){
        return userService.create(user);
    }

    @RequestMapping(path = "/getUsers", method = RequestMethod.GET)
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public User update(@Valid @RequestBody User user){
        return userService.update(user);
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public User getUser(@Valid @RequestBody Integer id){
        return userService.getById(id);
    }

}
