package com.ponnalearn.springfullstackreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ponnalearn.springfullstackreact.model.Contact;
import com.ponnalearn.springfullstackreact.repository.ContactRepository;

@Component
public class ContactDataLoader implements CommandLineRunner {

	private ContactRepository contactRepository;
	
	@Autowired
	public ContactDataLoader(ContactRepository contactRepository) {
	
		this.contactRepository=contactRepository;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Contact contact1=new Contact("Ponnaga","Vanimisetti","pvanimis@gmail.com");
		Contact contact2=new Contact("Venkata","Nimmala","vnimmala@gmail.com");
		Contact contact3=new Contact("Karthik","Sai","ksai@gmail.com");
		contactRepository.save(contact1);
		contactRepository.save(contact2);
		contactRepository.save(contact3);
		System.out.println(" Contacts Saved");*/

	}

}
