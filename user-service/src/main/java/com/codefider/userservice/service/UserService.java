package com.codefider.userservice.service;

import com.codefider.userservice.entity.User;

import java.util.List;

public interface UserService {

    User getUser(Long id);

    List<User> getUsers();
}
