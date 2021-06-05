package com.compiler.user.service;

import com.compiler.user.model.User;

import java.util.List;

public interface UserService {
    boolean createUser(User user);
    User getUser(String username);
    List<User> getAllUser();
    boolean updateUser(String username);
    boolean deleteUser(String username);
}
