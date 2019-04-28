package com.gospodarka.demo.entity;

import javax.persistence.*;

@Entity(name = "user_furniture")
public class UserFurniture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    int userId;
    @Column(name = "furnitureid")
    int furnitureId;

    public UserFurniture() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(int furnitureId) {
        this.furnitureId = furnitureId;
    }
}
