package com.ponnalearn.springfullstackreact.controller;

import java.net.URISyntaxException;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ponnalearn.springfullstackreact.model.Contact;
import com.ponnalearn.springfullstackreact.repository.ContactRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000")
public class ContactsController {

		private ContactRepository contactRepository;
		
		public ContactsController( ContactRepository contactRepository) {
			this.contactRepository=contactRepository;
		}
	
		@GetMapping("/contacts")
		public Collection<Contact> fetchContacts(){
			
			return (Collection<Contact>)(contactRepository.findAll());
		}
		
		@PostMapping("/contacts")
		ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) throws URISyntaxException{
				Contact result=contactRepository.save(contact);
				return ResponseEntity.ok().body(result);
		}
		
		@PutMapping("/contacts/update")
		ResponseEntity<Contact> updateContact(@Valid @RequestBody Contact contact) throws URISyntaxException{
				Contact result=contactRepository.save(contact);
				return ResponseEntity.ok().body(result);
		}
		
		@DeleteMapping("/contacts/delete")
		ResponseEntity<String> deleteContact(@Valid @RequestBody Contact contact) throws URISyntaxException{
				contactRepository.delete(contact);
				return ResponseEntity.ok().body("Contact Has been Deleted Successfully");
		}
		
		
}
