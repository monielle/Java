package com.example.estudo.demo.repository;

import com.example.estudo.demo.entities.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;


//objeto de acesso aos dados
//camada de acesso aos dados
public interface UserRepository extends JpaRepository<User, Long> {
}
