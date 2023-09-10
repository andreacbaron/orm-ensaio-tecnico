package com.example.ormensaiotecnico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ormensaiotecnico.dto.UserDTO;
import com.example.ormensaiotecnico.entities.User;
import com.example.ormensaiotecnico.repositories.UserRepository;

@Service
public class UserServices {
    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }
}
