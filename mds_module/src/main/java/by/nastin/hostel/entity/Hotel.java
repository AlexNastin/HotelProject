package by.nastin.hostel.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "hotel")
@AttributeOverride(name = "id", column = @Column(name = "id_hotel"))
public class Hotel extends BaseEntity {

    @Column(name = "star")
    private byte star;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Room> rooms;

    public Hotel() {

    }

    public byte getStar() {
        return star;
    }

    public void setStar(byte star) {
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hotel hotel = (Hotel) o;
        return star == hotel.star &&
                Objects.equals(name, hotel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), star, name);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "star=" + star +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
