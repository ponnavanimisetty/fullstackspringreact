package com.ponnalearn.springfullstackreact.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ponnalearn.springfullstackreact.model.Contact;

@RepositoryRestResource
public interface ContactRepository extends CrudRepository<Contact, Long> {

	
}
