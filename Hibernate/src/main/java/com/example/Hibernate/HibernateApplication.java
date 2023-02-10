package com.example.Hibernate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Hibernate.Service.IRestaurantservice;
import com.example.Hibernate.model.Item;
import com.example.Hibernate.model.Restaurant;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}
    @Autowired
	private IRestaurantservice restaurantservice;
    
	@Override
	public void run(String... args) throws Exception {
		

		Item itemOne = new Item("Dosa","BreakFast","SS",100);
		Item itemTwo = new Item("Idly","Dinner","SS",200);
		Item itemThree = new Item("Rice","MainCourse","SS",300);
		
		List<Item> itemsList = Arrays.asList(itemOne,itemTwo,itemThree);
		Set<Item> items = new HashSet<>(itemsList);
		Restaurant restaurant = new Restaurant("Taj","non-veg","Banglore",items);
		
		restaurantservice.addRestaurant(restaurant);
	}

}
