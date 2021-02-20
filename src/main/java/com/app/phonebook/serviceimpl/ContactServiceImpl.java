package com.app.phonebook.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.phonebook.entity.ContactEntity;
import com.app.phonebook.model.Contact;
import com.app.phonebook.repository.ContactRepository;
import com.app.phonebook.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repo;

	@Override
	public boolean saveContac(Contact c) {
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(c, entity);
		ContactEntity saveEntity = repo.save(entity);
		return saveEntity.getContactId() != null;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<ContactEntity> entities = repo.findAll();
		// List<Contact> contacts = new ArrayList<>();

		return entities.stream().map(entity -> {
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			return contact;
		}).collect(Collectors.toList());
	}

	@Override
	public Optional<Contact> getContactById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(Contact id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
