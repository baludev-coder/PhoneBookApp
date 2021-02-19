package com.app.phonebook.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.phonebook.entity.ContactEntity;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Serializable> {
}
