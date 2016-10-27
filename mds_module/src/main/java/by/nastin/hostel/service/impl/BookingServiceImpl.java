package by.nastin.hostel.service.impl;

import by.nastin.hostel.entity.Booking;
import by.nastin.hostel.repository.BookingRepository;
import by.nastin.hostel.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking create(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking getById(Integer id) {
        return bookingRepository.findOne(id);
    }

    public Booking update(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void delete(Integer id) {
        bookingRepository.delete(id);
    }
}
