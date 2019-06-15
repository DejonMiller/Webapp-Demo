package com.example.webapp.webapp.repository;

import java.util.List;

import com.example.webapp.webapp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByFirstname(String firstname);

}

