package ua.com.bonapetit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.com.bonapetit.dao.DishDao;
import ua.com.bonapetit.entity.Dish;
import ua.com.bonapetit.service.DishService;

public class DishServiceImpl implements DishService {

	
	@Autowired
	private DishDao DishService;
	
	public void save(Dish dish) {
	 DishService.save(dish);
	}

	public List<Dish> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Dish findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
