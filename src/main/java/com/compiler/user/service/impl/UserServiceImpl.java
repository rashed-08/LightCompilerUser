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
    private UserRepositoryImpl userRepository;

    @Override
    public boolean createUser(User user) {
        if (userRepository.createUser(user)) {
            return true;
        }
        return false;
    }

    @Override
    public User getUser(String username) {
        User user = userRepository.getUser(username);
        if (user != null) {
            return user;
        }
        return null;
    }

    @Override
    public List<User> getAllUser() {
        List<User> allUser = userRepository.getAllUser();
        System.out.println(allUser);
        return allUser;
    }

    @Override
    public boolean updateUser(String username) {
        User user = getUser(username);
        if (user != null) {
            userRepository.updateUser(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(String username) {
        User user = getUser(username);
        System.out.println(user.toString());
        boolean isUserActive = user.isActive();
        if (isUserActive) {
            user.setActive(false);
            userRepository.updateUser(user);
            return true;
        }
        return false;
    }
}
