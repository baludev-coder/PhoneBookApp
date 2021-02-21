package com.app.phonebook.service;

import java.util.List;
import java.util.Optional;

import com.app.phonebook.model.Contact;

public interface ContactService {

	boolean saveContac(Contact c);

	List<Contact> getAllContacts();

	Contact getContactById(Integer id);

	boolean updateContact(Contact id);

	boolean deleteContact(Integer id);
}
