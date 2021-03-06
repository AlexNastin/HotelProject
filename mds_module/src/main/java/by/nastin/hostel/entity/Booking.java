package by.nastin.hostel.entity;


import by.nastin.hostel.entity.converter.LocalDateAttributeConverter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name = "booking")
@AttributeOverride(name = "id", column = @Column(name = "id_booking"))
public class Booking extends BaseEntity {

    @Convert(converter = LocalDateAttributeConverter.class)
    @Column(name = "start_date")
    private LocalDate startDate;
    @Convert(converter = LocalDateAttributeConverter.class)
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "id_hotel")
    private int idHotel;
    @Column(name = "id_room")
    private int idRoom;
    @Column(name = "id_user")
    private int idUser;

    public Booking() {
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Booking booking = (Booking) o;
        return idHotel == booking.idHotel &&
                idRoom == booking.idRoom &&
                idUser == booking.idUser &&
                Objects.equals(startDate, booking.startDate) &&
                Objects.equals(endDate, booking.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), startDate, endDate, idHotel, idRoom, idUser);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", idHotel=" + idHotel +
                ", idRoom=" + idRoom +
                ", idUser=" + idUser +
                "} " + super.toString();
    }
}


