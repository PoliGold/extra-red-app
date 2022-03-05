package com.poligold.controller;

import com.poligold.model.User;
import com.poligold.repository.UserRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

@Path("/user")
public class UserController {

	@Inject
	UserRepository userRepository;

	@GET
	public Response get(@PathParam("mail") String mail) {
		User user = userRepository.findByEmail(mail);
		return Response.ok(user).build();
	}


	@POST
	public Response create(User user) throws URISyntaxException {
		userRepository.persist(user);
		return Response.created(new URI("/" + user.id)).build();
	}

}
