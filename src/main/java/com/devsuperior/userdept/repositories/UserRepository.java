package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept.entities.User;

//criando a interface do jpa repository para gerenciar o acesso ao banco de dados da entidade User

public interface UserRepository extends JpaRepository<User, Long>{

}
