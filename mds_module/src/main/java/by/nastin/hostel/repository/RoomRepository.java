package by.nastin.hostel.repository;

import by.nastin.hostel.entity.Hotel;
import by.nastin.hostel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("roomRepository")
public interface RoomRepository extends JpaRepository<Room, Integer> {
    @Override
    List<Room> findAll();

    List<Room> findRoomByHotel(Hotel hotel);

    List<Room> findRoomByHotelId(Integer idHotel);
}
