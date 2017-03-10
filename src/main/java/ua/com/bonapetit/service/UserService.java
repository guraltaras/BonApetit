package ua.com.bonapetit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.com.bonapetit.entity.Adress;
import ua.com.bonapetit.entity.User;

@Service
public interface UserService {
	void save(User user);
	List<User> findAll();
	User findOne (int id);
	void delete (int id);
}
