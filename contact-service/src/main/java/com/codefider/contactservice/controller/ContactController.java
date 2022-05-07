package com.codefider.contactservice.controller;

import com.codefider.contactservice.entity.Contact;
import com.codefider.contactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/getAllContact")
    public List<Contact> contactList() {
        List<Contact> contactList = contactService.getAllContacts();
        return contactList;

    }

    @GetMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId) {
        return contactService.listOfContact(userId);
    }

    @PostMapping("/saveContact")
    public ResponseEntity<?> addContact(@RequestBody Contact contact) {
        Contact save = contactService.saveContact(contact);
        return ResponseEntity.ok(save);

    }

}
