package com.devsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Annotation da jpa para tratamento da tabela e relacionamentos

@Entity
@Table(name = "tb_department")
public class Department {
	
	//indica que esse vai ser o id ou chave primaria na tabela
	//Criação de id único pelo próprio banco de dados

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Department() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
