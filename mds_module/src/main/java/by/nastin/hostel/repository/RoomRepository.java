package by.nastin.hostel.repository;

import by.nastin.hostel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roomRepository")
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
