package org.academiadecodigo.bootcamp.model;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "codecadet")
public class CodeCadet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;

    private String name;

    @OneToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String adress;
    private String city;
    private String phone;

    @ManyToOne
    private Bootcamp bootcamp;
    private Date birthdate;

    public CodeCadet(String name,User user, Gender gender, String adress, String city, String phone, Date birthdate){
        this.name = name;
        this.user = user;
        this.gender = gender;
        this.city=city;
        this.gender = gender;
        this.adress = adress;
        this.phone = phone;
        this.birthdate = birthdate;
    }

    public CodeCadet(){

    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodeCadet codeCadet = (CodeCadet) o;

        return user != null ? user.equals(codeCadet.user) : codeCadet.user == null;
    }

    @Override
    public int hashCode() {
        return user != null ? user.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CodeCadet{" +
                "user=" + user +
                ", gender=" + gender +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", org.bootcamp=" + bootcamp +
                ", birthdate=" + birthdate +
                '}';
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public User getUser() {
        return user;
    }

    public Gender getGender() {
        return gender;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public Date getBirthdate() {
        return birthdate;
    }
}
