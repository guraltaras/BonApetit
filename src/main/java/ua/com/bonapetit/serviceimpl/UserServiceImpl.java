package ua.com.bonapetit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.bonapetit.dao.UserDao;
import ua.com.bonapetit.entity.User;
import ua.com.bonapetit.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	public void save(User user) {
		dao.save(user);

	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public User findOne(int id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	public void delete(int id) {
	dao.delete(id);

	}

}
