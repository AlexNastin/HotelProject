package by.nastin.hostel.service;

import by.nastin.hostel.entity.User;

import java.util.List;

public interface UserService {
    User create(User user);

    User getById(Integer id);

    User update(User user);

    void delete(Integer id);

    List<User> getAllUsers();
}
