package ua.com.bonapetit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.bonapetit.dao.DishDao;
import ua.com.bonapetit.entity.Dish;
import ua.com.bonapetit.service.DishService;
@Service
public class DishServiceImpl implements DishService {

	
	@Autowired
	private DishDao DishService;
	
	public void save(Dish dish) {
	 DishService.save(dish);
	}

	public List<Dish> findAll() {
	 return  DishService.findAll();
	}

	public Dish findOne(int id) {
		return DishService.findOne(id);
	}

	public void delete(int id) {
		DishService.delete(id);
	}

}
