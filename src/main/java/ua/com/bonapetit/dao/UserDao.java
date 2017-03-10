package ua.com.bonapetit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.bonapetit.entity.User;

public interface UserDao  extends JpaRepository<User, Integer> {

}
