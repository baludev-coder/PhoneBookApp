package com.app.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.phonebook.model.Contact;
import com.app.phonebook.serviceimpl.ContactServiceImpl;

@Controller
public class ViewContactController {
	@Autowired
	private ContactServiceImpl service;

	@RequestMapping(value = "/editcontact",method = RequestMethod.GET)
	public String updateContacts(@RequestParam("cid") Integer contactId, Model model) {
		Contact c = service.getContactById(contactId);
		model.addAttribute("contact", c);
		return "contactinfo";
	}
	
	
	@RequestMapping(value = "/deletecontact")
	public String deletContact(@RequestParam("cid") Integer contactId)
	{
		boolean isDeleted = service.deleteContact(contactId);
		if(isDeleted)
		{
			return "redirect:/viewcontacts";
		}
		return null;
	}
}
