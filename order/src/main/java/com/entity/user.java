package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class user {

    private Long id;
    private String name;

    public user(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public user() {
    }

    public user(String name) {
        this.name = name;
    }

    public user(Long id) {
        this.id = id;
    }
}
