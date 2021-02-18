package com.app.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.phonebook.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
