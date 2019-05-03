package com.gospodarka.demo.entity;

import java.io.Serializable;
import java.util.Objects;

public class UserFurniturePK implements Serializable {

    private int userId;
    private int furnitureId;

    public UserFurniturePK(){

    }
    public UserFurniturePK(int userId, int furnitureId) {
        this.userId = userId;
        this.furnitureId = furnitureId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserFurniturePK that = (UserFurniturePK) o;
        return userId == that.userId &&
                furnitureId == that.furnitureId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, furnitureId);
    }
}
