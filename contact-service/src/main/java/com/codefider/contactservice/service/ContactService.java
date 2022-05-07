package com.codefider.contactservice.service;

import com.codefider.contactservice.entity.Contact;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ContactService {

    public List<Contact> listOfContact(Long userId);
    public Contact saveContact(Contact contact);

    List<Contact> getAllContacts();
}
