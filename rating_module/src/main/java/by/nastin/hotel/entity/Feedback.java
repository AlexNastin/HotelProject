package by.nastin.hotel.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Objects;

@Document(collection = "feedback")
public class Feedback extends BaseEntity {

    private Integer idHotel;

    private Integer idUser;

    @Field("publicationTime")
    private LocalDateTime date;

    private String text;

    public Feedback() {
    }

    public Integer getIdHotele() {
        return idHotel;
    }

    public void setIdHotele(Integer idHotele) {
        this.idHotel = idHotele;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Feedback feedback = (Feedback) o;
        return Objects.equals(idHotel, feedback.idHotel) &&
                Objects.equals(idUser, feedback.idUser) &&
                Objects.equals(date, feedback.date) &&
                Objects.equals(text, feedback.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idHotel, idUser, date, text);
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "idHotele=" + idHotel +
                ", idUser=" + idUser +
                ", date=" + date +
                ", text='" + text + '\'' +
                "} " + super.toString();
    }
}
