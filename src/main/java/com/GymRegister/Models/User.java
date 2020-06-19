package com.GymRegister.Models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="USERS", schema = "GYM", catalog="")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long User_id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String firstname;

    @NotNull
    private String lastname;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private List <Training> trainings=new ArrayList<Training>();

    public User(long user_id, String username, String password, String firstname, String lastname) {
        User_id = user_id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User() {
    }

    public long getUser_id() {
        return User_id;
    }

    public void setUser_id(long user_id) {
        User_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
