package by.nastin.hostel.service;

import by.nastin.hostel.entity.Booking;

public interface BookingService {
    Booking create(Booking booking);

    Booking getById(Integer id);

    Booking update(Booking booking);

    void delete(Integer id);
}
