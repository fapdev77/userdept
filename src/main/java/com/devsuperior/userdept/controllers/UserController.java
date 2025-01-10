package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

//Anotação que indica que esse controller é um rest controller
@RestController
//Mapeamento do end point que a aplicação deve responder.
@RequestMapping(value = "/users")
public class UserController {
	
	//anotação Autowired instância automaticamente o objeto e já efetua as configurações necessárias.
	@Autowired
	public UserRepository repository;
	
	//Anottation que informa que devemos responder ao verbo http get
	@GetMapping
	public List<User> findAll() {
		List<User> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
	}
	
	//Inserir um novo registro no banco de dados utilizamos a anotação @PostMapping 
	//juntamente com o @RequestBody (onde pega os dados para salvar)
	@PostMapping
	public User insert(@RequestBody User user) {
		User result = repository.save(user);
		return result;
	}

}
