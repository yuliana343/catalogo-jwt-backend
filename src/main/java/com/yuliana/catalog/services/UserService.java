package com.yuliana.catalog.services;

import com.yuliana.catalog.entities.User;
import com.yuliana.catalog.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username).orElse(null);
    }
}
