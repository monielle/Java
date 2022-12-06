package com.example.estudo.demo.dto;

import com.example.estudo.demo.entities.User;

public class UserDTO {

    private Long id;
    private String name;

    public UserDTO(){

    }

    public UserDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
    }


}
