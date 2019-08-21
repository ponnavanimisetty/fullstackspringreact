package com.ponnalearn.springfullstackreact.repository;



import org.springframework.data.repository.CrudRepository;

import com.ponnalearn.springfullstackreact.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {

	
}
