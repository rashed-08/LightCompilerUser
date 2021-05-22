package com.compiler.user.service;

import com.compiler.user.model.User;

import java.util.List;

public interface UserService {
    boolean createUser(User user);
    User getUser(int id);
    List<User> getAllUser();
    boolean updateUser(int id);
    boolean deleteUser(int id);
}
