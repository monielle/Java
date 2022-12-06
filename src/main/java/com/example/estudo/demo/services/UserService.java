package com.example.estudo.demo.services;


import com.example.estudo.demo.dto.UserDTO;
import com.example.estudo.demo.entities.User;
import com.example.estudo.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public UserDTO findById(Long id){
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }
}
