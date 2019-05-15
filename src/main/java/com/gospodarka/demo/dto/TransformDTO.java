package com.gospodarka.demo.dto;

public class TransformDTO {

    private int id;
    private float x;
    private float y;
    private float z;
    private int furnitureId;

    public TransformDTO() {    }

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
