package com.compiler.user.service.impl;

import com.compiler.user.model.User;
import com.compiler.user.repository.impl.UserRepositoryImpl;
import com.compiler.user.service.UserService;
import com.compiler.user.validator.impl.UserValidatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserValidatorImpl userValidator;

    @Autowired
    private UserRepositoryImpl userRepository;

    @Override
    public boolean createUser(User user) {
        if (userValidator.userCreateValidator(user)) {
            userRepository.createUser(user);
            return true;
        }
        return false;
    }

    @Override
    public User getUser(int id) {
        User user = userRepository.getUser(id);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> allUser = userRepository.getAllUser();
        return allUser;
    }

    @Override
    public boolean updateUser(int id) {
        User user = getUser(id);
        if (user != null) {
            userRepository.updateUser(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        userRepository.deleteUser(id);
        return true;
    }
}
