package ua.com.bonapetit.entity;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	// діє на одне поле
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String cpen;
	private String close;
	@ManyToOne(fetch = FetchType.LAZY)
	private Menu menu;
	@ManyToOne(fetch = FetchType.LAZY)
	private Adress adress;
	

	public Restaurant() {
	}

	

	public Restaurant(String name, String cpen, String close, Menu menu,
			Adress adress) {
		super();
		this.name = name;
		this.cpen = cpen;
		this.close = close;
		this.menu = menu;
		this.adress = adress;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getCpen() {
		return cpen;
	}



	public void setCpen(String cpen) {
		this.cpen = cpen;
	}



	public String getClose() {
		return close;
	}



	public void setClose(String close) {
		this.close = close;
	}



	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

}
