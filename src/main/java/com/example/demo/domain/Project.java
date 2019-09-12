
package com.example.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor
@Entity
public class Project {

	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Account account;
	private String name;
	private String description;

	public Project(Account account, String name, String description) {
		this.account = account;
		this.name = name;
		this.description = description;
	}

}
