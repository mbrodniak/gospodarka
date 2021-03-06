package com.gospodarka.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gospodarka.demo.dto.FurnitureDTO;

import javax.persistence.*;

@Entity(name = "furniture")
public class Furniture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "texture")
    private String texture;
    @Column(name = "icon")
    private String icon;
    @Column(name = "category")
    private String category;
    @Column(name = "description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id",referencedColumnName = "furnitureid")
    @JsonIgnoreProperties({ "id", "furnitureId" })
    private Transform transform;


    public Furniture(){}

    public Furniture(FurnitureDTO furnitureDTO){

        this.name = furnitureDTO.getName();
        this.location = furnitureDTO.getLocation();
        this.texture = furnitureDTO.getTexture();
        this.icon = furnitureDTO.getIcon();
        this.category = furnitureDTO.getCategory();
        this.description = furnitureDTO.getDescription();

    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

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

    public Transform getTransform() { return transform; }
    public void setTransform(Transform transform) { this.transform = transform; }

}
