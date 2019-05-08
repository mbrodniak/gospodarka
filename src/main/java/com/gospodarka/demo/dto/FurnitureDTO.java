package com.gospodarka.demo.dto;

public class FurnitureDTO {

    private String name;
    private String location;
    private String texture;
    private String icon;
    private String category;
    private String description;

    public FurnitureDTO(){}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getTexture() { return texture; }
    public void setTexture(String texture) { this.texture = texture; }

    public String getIcon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

}
