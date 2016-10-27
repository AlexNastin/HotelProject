package by.nastin.hostel;

import by.nastin.hostel.config.DataSourceConfig;
import by.nastin.hostel.entity.User;
import by.nastin.hostel.repository.BookingRepository;
import by.nastin.hostel.repository.HotelRepository;
import by.nastin.hostel.repository.RoomRepository;
import by.nastin.hostel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;

@SpringBootApplication
@Import(DataSourceConfig.class)
public class MdsModuleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(MdsModuleApplication.class, args);
		UserRepository userRepository = (UserRepository) applicationContext.getBean("userRepository");
		userRepository.findAll().forEach(it -> System.out.println(it));
		HotelRepository hotelRepository = (HotelRepository) applicationContext.getBean("hotelRepository");
		hotelRepository.findAll().forEach(it -> System.out.println(it));
		RoomRepository roomRepository = (RoomRepository) applicationContext.getBean("roomRepository");
		roomRepository.findAll().forEach(it -> System.out.println(it));
		BookingRepository bookingRepository = (BookingRepository) applicationContext.getBean("bookingRepository");
		bookingRepository.findAll().forEach(it -> System.out.println(it));
	}
}