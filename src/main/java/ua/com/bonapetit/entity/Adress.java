package ua.com.bonapetit.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "adress")
public class Adress {

	@Id
	// діє на одне поле
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	private String streat;
	private Double house;

	public void Adress() {
	};

	@OneToMany(mappedBy = "adress")
	private List<Restaurant> restaurant = new ArrayList<Restaurant>();

	public Adress(String city, String streat, Double house,
			List<Restaurant> restaurant) {
		super();
		this.city = city;
		this.streat = streat;
		this.house = house;
		this.restaurant = restaurant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreat() {
		return streat;
	}

	public void setStreat(String streat) {
		this.streat = streat;
	}

	public Double getHouse() {
		return house;
	}

	public void setHouse(Double house) {
		this.house = house;
	}

	public List<Restaurant> getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(List<Restaurant> restaurant) {
		this.restaurant = restaurant;
	}

}
