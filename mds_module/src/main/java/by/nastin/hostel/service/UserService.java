package by.nastin.hostel.service;

import by.nastin.hostel.entity.User;

public interface UserService {
    User create(User user);

    User getById(Integer id);

    User update(User user);

    void delete(Integer id);
}
