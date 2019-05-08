package com.gospodarka.demo.entity;

import com.gospodarka.demo.dto.UserDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "login")
    String login;
    @Column(name = "password")
    String password;
    @Column(name = "email")
    String email;
    @Column(name = "name")
    String name;
    @Column(name = "vorname")
    String vorname;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_furniture",
            joinColumns = {@JoinColumn(name = "userid")},
            inverseJoinColumns = {@JoinColumn(name = "furnitureid")}
    )
    List<Furniture> furnitures = new ArrayList<>();


    public User() {
    }

    public User(UserDTO userDTO) {

//        this.id = userDTO.getId();
        this.login = userDTO.getLogin();
        this.password = userDTO.getPassword();
        this.email = userDTO.getEmail();
        this.name = userDTO.getName();
        this.vorname = userDTO.getVorname();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public List<Furniture> getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(List<Furniture> furnitures) {
        this.furnitures = furnitures;
    }
}
