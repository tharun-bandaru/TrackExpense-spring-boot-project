package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="userss")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@Column
	private String id;
	
	@Column
	private String email;
}
