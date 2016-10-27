package by.nastin.hostel.service.impl;


import by.nastin.hostel.entity.Hotel;
import by.nastin.hostel.repository.HotelRepository;
import by.nastin.hostel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;

public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getById(Integer id) {
        return hotelRepository.findOne(id);
    }

    @Override
    public Hotel update(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void delete(Integer id) {
        hotelRepository.delete(id);
    }
}
