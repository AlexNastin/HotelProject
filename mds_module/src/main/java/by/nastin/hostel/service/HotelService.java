package by.nastin.hostel.service;


import by.nastin.hostel.entity.Hotel;

public interface HotelService {
    Hotel create(Hotel hotel);

    Hotel getById(Integer id);

    Hotel update(Hotel hotel);

    void delete(Integer id);
}
