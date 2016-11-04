package by.nastin.hostel.service.impl;

import by.nastin.hostel.entity.Room;
import by.nastin.hostel.repository.RoomRepository;
import by.nastin.hostel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {

    @Autowired
    @Qualifier("roomRepository")
    private RoomRepository roomRepository;

    @Override
    public Room create(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room getById(Integer id) {
        return roomRepository.findOne(id);
    }

    @Override
    public Room update(Room room) {
        return roomRepository.save(room);
    }

    public void delete(Integer id) {
        roomRepository.delete(id);
    }
}
