package com.compiler.user.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "first_name")
    @NotBlank(message = "Firstname cant be null")
    @Size(min = 3, max = 20, message = "Please provide name between 3 and 20 characters")
    @Pattern(regexp = "(?i)(^[a-z])((?![ ._'-]$)[a-z ._'-]){2,24}$")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Lastname cant be null")
    @Size(min = 3, max = 20, message = "Please provide name between 3 and 20 characters")
    @Pattern(regexp = "(?i)(^[a-z])((?![ ._'-]$)[a-z ._'-]){2,24}$")
    private String lastName;

    @NotBlank
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
    private String email;

    @NotBlank
    private String username;

    @NotBlank
    private String password;
    private String country;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String email, String username, String password, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.country = country;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
