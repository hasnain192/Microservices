package com.codefider.contactservice.service;

import com.codefider.contactservice.entity.Contact;
import com.codefider.contactservice.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    // TODO connect with db
    @Autowired
    private ContactRepository contactRepository;

    List<Contact> contactList= Arrays.asList(
            new Contact(1L,"hasnain2win@gmail.com","Hasnain",1311L),
            new Contact(2L,"eyfath2win@gmail.com","Eyfath",1312L),
            new Contact(3L,"ladla2win@gmail.com","Ladla",1313L)
    );


    @Override
    public List<Contact> listOfContact(Long userId) {
        return contactList.stream().filter(
                contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }

    @Override
    public Contact saveContact(Contact contact) {

        contactRepository.save(contact);
        return contact;
    }
}
