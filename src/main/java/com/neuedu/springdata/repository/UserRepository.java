package com.neuedu.springdata.repository;

import com.neuedu.springdata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserName(String username);
}

