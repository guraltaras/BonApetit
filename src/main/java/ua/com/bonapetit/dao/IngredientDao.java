package ua.com.bonapetit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;



import ua.com.bonapetit.entity.Ingredient;

public interface IngredientDao    extends JpaRepository<Ingredient, Integer>,JpaSpecificationExecutor<Ingredient>{

	
	Ingredient Name(String name);
	
}
