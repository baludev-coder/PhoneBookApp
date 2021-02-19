package com.app.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.phonebook.entity.ContactEntity;
import com.app.phonebook.model.Contact;
import com.app.phonebook.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService service;

	@GetMapping(value = "/")
	public String loadForm(Model model) {
		Contact c = new Contact();
		model.addAttribute("contact", c);
		return "contactinfo";
	}

	@PostMapping(value = "/saveContact")
	public String saveContact(@ModelAttribute("contact") Contact c, Model model) {
		boolean isSaved = service.saveContac(c);
		if (isSaved) {
			model.addAttribute("succMsg", " ContactSaved");
		} else {
			model.addAttribute("errMsg", "Failed to contact saved");
		}

		return "contactinfo";
	}
}
