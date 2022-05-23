package com.test.Ignitis.repository;

import com.test.Ignitis.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
