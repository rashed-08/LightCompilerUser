package com.compiler.user.validator.impl;

import com.compiler.user.model.User;
import com.compiler.user.validator.UserValidator;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class UserValidatorImpl implements UserValidator, Validator {
    @Override
    public boolean userCreateValidator(User user) {
        return false;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
