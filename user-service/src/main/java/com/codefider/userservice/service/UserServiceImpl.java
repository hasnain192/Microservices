package com.codefider.userservice.service;

import com.codefider.userservice.entity.User;
import com.codefider.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // TODO Load from data base

    @Autowired
    private UserRepository userRepository;

    List<User> userList = Arrays.asList(
            new User(1311L, "Hasnain", "9182325188"),
            new User(1312L, "Eyfat", "9572588789"),
            new User(1313L, "Ladla", "8969408406")
    );

    @Override
    public User getUser(Long id) {
        return this.userList.stream().filter(
                user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return userList;
    }

    @Override
    public void saveUser(User user) {

        userRepository.save(user);
    }
}
