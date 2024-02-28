package com.gefersonholdorf.projectweb_servicespringbootjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gefersonholdorf.projectweb_servicespringbootjpa.entities.User;
import com.gefersonholdorf.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }    

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
