package com.juyoung.tdd.demo.domain;


import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@ToString
public class Car {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String type;

    public Car() {
    }

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
