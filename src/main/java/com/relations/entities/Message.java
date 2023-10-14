package com.relations.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
public class Message extends Audit{
	@NotBlank
	private String message;
	@ManyToMany
	List<User> users=new ArrayList<User>();


}
