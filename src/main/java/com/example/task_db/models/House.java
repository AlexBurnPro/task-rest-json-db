package com.example.task_db.models;

import javax.persistence.*;

@Entity
@Table(name = "houses", schema = "task_db")
public class House {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "number")
    private String number;

    @Column(name = "street_id")
    @ManyToOne
    private Street streetId;

    public House() {
    }

    public House(String number, Street streetId) {
        this.number = number;
        this.streetId = streetId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Street getStreetId() {
        return streetId;
    }

    public void setStreetId(Street streetId) {
        this.streetId = streetId;
    }
}
