package com.project.onlyfactdb.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.onlyfactdb.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
