package com.example.Hibernate.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(generator ="restaurant_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "item_gen",sequenceName = "item_sequence",initialValue = 1,allocationSize =1)
	private Integer itemid;
	
	@Column(name="itemname",length=20)
	private String itemname;
	
	@Column(length=20)
	private String category;
	
	@Column(length=20)
	private String cuisine;
	
	private double price;
	
	
	
	public Item()
	{
		super();
	}

	public Item(String itemname, String category, String cuisine, double price) {
		super();
		this.itemname = itemname;
		this.category = category;
		this.cuisine = cuisine;
		this.price = price;
	}

	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + ", category=" + category + ", cuisine=" + cuisine
				+ ", price=" + price + "]";
	}

	

}
