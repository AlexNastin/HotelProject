package by.nastin.hostel.controller;


import by.nastin.hostel.entity.User;
import by.nastin.hostel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/mds/user")
public class UserController {

    @Autowired
    private UserService userService;


//    public User create



}
