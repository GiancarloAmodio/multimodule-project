package com.example.casinogames.service;

import com.example.casinogames.model.User;
import com.example.casinogames.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User register(User user) {
        return repository.save(user);
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public User updateUser(User user) {
        return repository.save(user);
    }

    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}
