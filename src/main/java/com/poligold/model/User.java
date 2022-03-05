package com.poligold.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Data;

@Data
public class User extends PanacheMongoEntity {

	private String name;
	private String surname;
	private String email;
	private String avatar;

}
