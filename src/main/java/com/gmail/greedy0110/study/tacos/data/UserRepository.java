package com.gmail.greedy0110.study.tacos.data;

import com.gmail.greedy0110.study.tacos.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
