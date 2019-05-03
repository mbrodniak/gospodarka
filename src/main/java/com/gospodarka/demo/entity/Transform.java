package com.gospodarka.demo.entity;

import javax.persistence.*;

@Entity(name = "transform")
public class Transform {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "x")
    private float x;
    @Column(name = "y")
    private float y;
    @Column(name = "z")
    private float z;
    @Column(name = "furnitureid")
    private int furnitureId;

    public Transform(){}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public float getX() { return x; }
    public void setX(float x) { this.x = x; }

    public float getY() { return y; }
    public void setY(float y) { this.y = y; }

    public float getZ() { return z; }
    public void setZ(float z) { this.z = z; }

    public int getFurnitureId() { return furnitureId; }
    public void setFurnitureId(int furnitureId) { this.furnitureId = furnitureId; }



}
