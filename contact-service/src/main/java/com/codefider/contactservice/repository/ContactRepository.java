package com.codefider.contactservice.repository;

import com.codefider.contactservice.entity.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends MongoRepository<Contact,Long> {

}
