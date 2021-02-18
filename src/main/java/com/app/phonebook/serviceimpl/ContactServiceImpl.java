package com.app.phonebook.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.phonebook.model.Contact;
import com.app.phonebook.repository.ContactRepository;
import com.app.phonebook.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repo;

	@Override
	public boolean saveContac(Contact c) {
		Contact isSaved = repo.save(c);
		if (isSaved != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = repo.findAll();
		return contacts;
	}

	@Override
	public Optional<Contact> getContactById(Integer id) {
		return repo.findById(id);

	}

	@Override
	public boolean updateContact(Contact id) {

		return false;
	}

	@Override
	public boolean deleteContact(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
