package by.nastin.hostel.service.impl;


import by.nastin.hostel.entity.Hotel;
import by.nastin.hostel.repository.HotelRepository;
import by.nastin.hostel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    @Qualifier("hotelRepository")
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
