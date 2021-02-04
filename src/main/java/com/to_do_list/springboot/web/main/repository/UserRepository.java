package com.to_do_list.springboot.web.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.to_do_list.springboot.web.main.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
