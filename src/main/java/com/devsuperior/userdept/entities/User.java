package com.devsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	
	//Aqui definimos os atributos do objeto
	//Atributo id é a chave primaria da tabela definida pelo annotation @Id e @GeneratedValue é a estratégia para gerar automaticamente id´s únicos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	
	//Aqui definimos a associação com a entidade department (composição de objetos) pois cada usuário pertence a um departamento..
	//Annotation que garante relacionamento muitos usuários para um departamento ou seja cada usuário somente pode ter um departamento associado.
	//Esta annotation @JoinColumn explicita qual é o campo com a chave extrangeira relacionada na tabela

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	//Aqui definimos o construtor da classe
	public User() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	

	
}
