package ua.com.bonapetit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.com.bonapetit.dao.RestaurantDao;
import ua.com.bonapetit.entity.Restaurant;
import ua.com.bonapetit.service.RestaurantService;

public class RestarantServiceImpl implements RestaurantService{

	
	@Autowired
	private RestaurantDao RestaurantService;

	public void save(Restaurant restaurant) {
		RestaurantService.save(restaurant);
	}

	public List<Restaurant> findAll() {
		return RestaurantService.findAll();
	}

	public Restaurant findOne(int id) {
		return RestaurantService.findOne(id);
	}

	public void delete(int id) {
		RestaurantService.delete(id);
	}
}
