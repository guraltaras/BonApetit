package ua.com.bonapetit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.com.bonapetit.dao.IngredientDao;
import ua.com.bonapetit.entity.Ingredient;
import ua.com.bonapetit.service.IngredientService;

public class IngredientServiceImpl   implements IngredientService{

	
	
	@Autowired
	private IngredientDao IngredientService;

	public void save(Ingredient ingredient) {
		
		IngredientService.save(ingredient);
	}

	public List<Ingredient> findAll() {
		return IngredientService.findAll();
	}

	public Ingredient findOne(int id) {
		
		return IngredientService.findOne(id);
	}

	public void delete(int id) {
		IngredientService.delete(id);
	}
}
