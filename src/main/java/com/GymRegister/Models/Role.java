package com.GymRegister.Models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="ROLES", schema = "GYM", catalog="")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private List <User> users;

    public Role(String role_user) {
        this.name=role_user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
