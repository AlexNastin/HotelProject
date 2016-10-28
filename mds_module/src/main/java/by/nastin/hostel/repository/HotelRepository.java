package by.nastin.hostel.repository;

import by.nastin.hostel.entity.Hotel;
import by.nastin.hostel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import java.util.List;

@Repository("hotelRepository")
public interface HotelRepository extends JpaRepository<Hotel,Integer>{
    @Override
    List<Hotel> findAll();

    Hotel findHotelById(Integer id);

    @Query("select h from Hotel h join fetch h.rooms")
    List<Hotel> findRoomsByHotel();



}
