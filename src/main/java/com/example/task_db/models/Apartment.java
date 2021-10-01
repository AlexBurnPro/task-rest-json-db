package com.example.task_db.models;

import javax.persistence.*;

@Entity
@Table(name = "apartments", schema = "task_db")
public class Apartment {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "area")
    private float area;

    @Column(name = "house_id")
    @ManyToOne
    private House house_id;

    public Apartment() {
    }

    public Apartment(float area, House house_id) {
        this.area = area;
        this.house_id = house_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public House getHouse_id() {
        return house_id;
    }

    public void setHouse_id(House house_id) {
        this.house_id = house_id;
    }
}
