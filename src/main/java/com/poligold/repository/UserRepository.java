package com.poligold.repository;

import com.poligold.model.User;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheMongoRepository<User> {

	public User findByEmail(String mail) {
		 return find("mail", mail).firstResult();
	}

}
