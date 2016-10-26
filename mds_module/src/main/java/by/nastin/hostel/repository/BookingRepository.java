package by.nastin.hostel.repository;

import by.nastin.hostel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookingRepository")
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
