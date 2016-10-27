package by.nastin.hostel.repository;

import by.nastin.hostel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookingRepository")
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    @Override
    List<Booking> findAll();
}
