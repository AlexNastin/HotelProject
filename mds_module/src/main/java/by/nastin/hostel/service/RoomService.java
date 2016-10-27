package by.nastin.hostel.service;

import by.nastin.hostel.entity.Room;

public interface RoomService {

    Room create(Room room);

    Room getById(Integer id);

    Room update(Room room);

    void delete(Integer id);
}
