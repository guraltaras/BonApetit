package ua.com.bonapetit.entity;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dish")
public class Dish {

	@Id
	// діє на одне поле
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String time;

	@ManyToOne(fetch = FetchType.LAZY)
	private Ingredient ingredient;
	private BigDecimal price;

	public Dish() {};

	@OneToMany(mappedBy = "menu")
	private List<Menu> dish = new ArrayList<Menu>();


	public Dish(String time, Ingredient ingredient, BigDecimal price,
			List<Menu> dish) {
		super();
		this.time = time;
		this.ingredient = ingredient;
		this.price = price;
		this.dish = dish;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<Menu> getDish() {
		return dish;
	}

	public void setDish(List<Menu> dish) {
		this.dish = dish;
	}

}
