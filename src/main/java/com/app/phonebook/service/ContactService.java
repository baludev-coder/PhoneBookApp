package com.app.phonebook.service;

import java.util.List;
import java.util.Optional;

import com.app.phonebook.model.Contact;

public interface ContactService {

	public boolean saveContac(Contact c);

	public List<Contact> getAllContacts();

	public Optional<Contact> getContactById(Integer id);

	public boolean updateContact(Contact id);

	public boolean deleteContact(Integer id);
}
