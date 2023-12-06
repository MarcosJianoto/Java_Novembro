package com.example.demo.entities;

import org.springframework.data.annotation.Id;

import jakarta.annotation.Generated;;

public class Department {

    private String name;

    public Department() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
