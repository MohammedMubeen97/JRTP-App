package in.me.mbn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.me.mbn.entity.Contact;
import in.me.mbn.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/contact")		
	ResponseEntity<String> contact (@RequestBody Contact contact) {
	String status	= contactService.upsert(contact);
		return new ResponseEntity<>(status, HttpStatus.CREATED);

	}
	
	@GetMapping("/contacts")
	ResponseEntity<List<Contact>> getAllContacts( ) {
	List<Contact> allContacts	= contactService.getAllContacts();
	return new ResponseEntity<>(allContacts, HttpStatus.FOUND);
	}

	@GetMapping("/contact/{cid}")
	ResponseEntity<Contact> getContact(@PathVariable int cid) {
		Contact contact = contactService.getContact(cid);
		return new ResponseEntity<Contact>(contact, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/contact/{cid}")
	ResponseEntity<String> deleteContact(@PathVariable int cid) {
		 String deleteContact = contactService.deleteContact(cid);
		 return new ResponseEntity<>(deleteContact, HttpStatus.GONE);
	}

}
