package com.example.ormensaiotecnico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ormensaiotecnico.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}
