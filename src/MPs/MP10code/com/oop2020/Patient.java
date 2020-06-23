package com.oop2020;

import java.util.Date;

public class Patient {
    private String id;
    private String name;

    public Patient(String name) {
        //this.id = id;
        Date d = new Date();
        long t = d.getTime();
        id = name + t;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Patient: name: " + name + " id: " + id;
    }
}
