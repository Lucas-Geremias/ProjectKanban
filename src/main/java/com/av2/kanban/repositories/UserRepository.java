package com.av2.kanban.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.av2.kanban.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
