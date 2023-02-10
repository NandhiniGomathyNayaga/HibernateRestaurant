package com.example.Hibernate.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity

public class Restaurant {
	@Id
	@GeneratedValue(generator ="restaurant_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "restaurant_gen",sequenceName = "restaurant_sequence",initialValue = 100,allocationSize =1)
	private Integer restaurantId;
	@Column(length=30)
	private String restaurantName;
	@Column(length=10)
	private String type;
	@Column(length=30)
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL)
	Set<Item> items;
	
	public Restaurant() {
		super();
	
	}
	
	public Restaurant(String restaurantName, String type, String city, Set<Item> items) {
		super();
		this.restaurantName = restaurantName;
		this.type = type;
		this.city = city;
		this.items = items;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", type=" + type
				+ ", city=" + city + ", items=" + items + "]";
	}

	
}
   
        
