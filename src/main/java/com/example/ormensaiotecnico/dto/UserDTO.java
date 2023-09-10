package com.example.ormensaiotecnico.dto;

import com.example.ormensaiotecnico.entities.User;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
	private String name;

    public UserDTO() {
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
