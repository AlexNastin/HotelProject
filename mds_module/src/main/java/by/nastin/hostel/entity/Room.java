package by.nastin.hostel.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "room")
@AttributeOverride(name = "id", column = @Column(name = "id_room"))
public class Room extends BaseEntity {

    @Column(name = "id_hotel")
    private int idHotel;

    @Column(name = "type", columnDefinition = "ENUM('ECONOM','LUX', 'FAMILY')")
    @Enumerated(EnumType.STRING)
    private TypeRoom typeRoom;

    @Column(name = "price")
    private double price;

    public Room() {
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return idHotel == room.idHotel &&
                Double.compare(room.price, price) == 0 &&
                typeRoom == room.typeRoom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idHotel, typeRoom, price);
    }

    @Override
    public String toString() {
        return "Room{" +
                "idHotel=" + idHotel +
                ", typeRoom=" + typeRoom +
                ", price=" + price +
                '}';
    }
}
