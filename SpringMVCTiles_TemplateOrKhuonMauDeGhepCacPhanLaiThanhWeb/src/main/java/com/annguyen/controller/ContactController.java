package com.annguyen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.annguyen.form.Contact;

@Controller
@SessionAttributes
public class ContactController {
	
	@RequestMapping("/contact")
	public String showContacts(Model m) {
		m.addAttribute("command", new Contact());
		return "contactABC";
	}

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result,Model model) {
		// write the code here to add contact
		model.addAttribute("message", "add contact success");
		return "redirect:contact.html";
	}
}
