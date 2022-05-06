package com.codefider.userservice.controller;

import com.codefider.userservice.entity.Contact;
import com.codefider.userservice.entity.User;
import com.codefider.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody User user) {

        //restTemplate.postForObject("http://contact-service:9002/contact/saveContact",contactList, List.class);
        return ResponseEntity.ok().body("User Record Saved Successfully");
    }

    @GetMapping("/getAll")
    public List<User> getAll() {

        List<User> userList = userService.getUsers();
        List<Contact> contacts = this.restTemplate.getForObject(
                "http://contact-service:9002/contact/getAllContact", List.class);
        System.out.println("Contact list-->" + contacts.stream().collect(Collectors.toList()));
        return userList;
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {

        User user = userService.getUser(userId);
        // http://localhost:9002/contact/user/1311
        List<Contact> contacts = this.restTemplate.getForObject(
                "http://contact-service:9002/contact/user/" + user.getUserId(), List.class);
        user.setContacts(contacts);
        return user;
    }

}
