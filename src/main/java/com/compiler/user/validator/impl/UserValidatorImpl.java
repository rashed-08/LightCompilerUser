package com.compiler.user.validator.impl;

import com.compiler.user.model.User;
import com.compiler.user.validator.UserValidator;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;


@Service
public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean userCreateValidator(User user) {
        return false;
    }
}
