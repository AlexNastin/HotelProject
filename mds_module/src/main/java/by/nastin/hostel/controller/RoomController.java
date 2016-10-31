package by.nastin.hostel.controller;

import by.nastin.hostel.entity.Room;
import by.nastin.hostel.repository.RoomRepository;
import by.nastin.hostel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/mds/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public Room create(@Valid @RequestBody Room room) {
        return  roomService.create(room);
    }

    @RequestMapping(path = "/get/{idHotel}/rooms", method = RequestMethod.GET)
    public List<Room> getAllRoomByIdHotel(@Valid @PathVariable("idHotel") Integer idHotel) {
        return  null;
    }


//    @RequestMapping(path = "")

}
