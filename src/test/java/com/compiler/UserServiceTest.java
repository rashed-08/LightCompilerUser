package com.compiler;

import com.compiler.user.model.User;
import com.compiler.user.repository.impl.UserRepositoryImpl;
import com.compiler.user.service.impl.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepositoryImpl userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    @DisplayName("Save Employee")
    public void createUser() {
        User user = new User(1, "first", "last", "rashed@bitmascot", "rashed","BD");
        userService.createUser(user);
        verify(userRepository, times(1)).createUser(user);
    }
}
