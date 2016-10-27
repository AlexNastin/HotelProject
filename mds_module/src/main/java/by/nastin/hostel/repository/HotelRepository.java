package by.nastin.hostel.repository;

import by.nastin.hostel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("hotelRepository")
public interface HotelRepository extends JpaRepository<Hotel,Integer>{
    @Override
    List<Hotel> findAll();

    Hotel findHotelById(Integer id);

}
