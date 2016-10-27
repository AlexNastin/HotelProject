package by.nastin.hostel.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user")
@AttributeOverride(name = "id", column = @Column(name = "id_user"))
public class User extends BaseEntity{

    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private byte status;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "gender", columnDefinition = "enum('MALE','FEMALE','NONE')")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return status == user.status &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), login, password, status, name, surname, gender);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                "} " + super.toString();
    }
}
