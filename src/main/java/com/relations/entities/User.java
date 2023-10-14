package com.relations.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class User extends Audit{

@Column(nullable = false)	
private String nom,prenom,adresse,tel;
@Column(columnDefinition = "integer default 20")
private int age;
@ManyToMany(mappedBy = "users")
private List<Message> messages=new ArrayList<Message>();

}
