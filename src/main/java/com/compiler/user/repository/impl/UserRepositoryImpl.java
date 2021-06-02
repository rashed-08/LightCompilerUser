package com.compiler.user.repository.impl;

import com.compiler.user.model.User;
import com.compiler.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryImpl {

    @Autowired
    private UserRepository userRepository;

    public boolean createUser(User user) {
        userRepository.save(user);
        return true;
    }

    public User getUser(int id) {
        User user = (User) userRepository.getById(id);
        return user;
    }

    public List<User> getAllUser() {
        List<User> allUser = userRepository.findAll();
        return allUser;
    }

    public boolean updateUser(User user) {
        userRepository.save(user);
        return true;
    }

    public boolean deleteUser(int id) {
        userRepository.deleteById(id);
        return true;
    }
}
