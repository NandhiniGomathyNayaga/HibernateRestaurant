package com.example.Hibernate.Service;

import java.util.List;

import com.example.Hibernate.model.Restaurant;

public interface IRestaurantservice {
	
	Restaurant addRestaurant(Restaurant restaurant);
	void updateRestaurant(Restaurant restaurant);
	void deleteRestaurant(int restaurantId);
	List<Restaurant> getAll();
	Restaurant getById(int restaurantId);
	
	List<Restaurant> getByCity(String city);
	List<Restaurant> getByType(String type);
	
	List<Restaurant> getByItemName(String itemname);
	List<Restaurant> getByCuisine(String cuisine);

}
